package src.Concurrent_Programming.TwoPhaseTermination;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class TwoPhaseTermination {
    /*
     * 这个设计模式的任务是在一个线程中终止另一个线程, 并且不是强行终止, 而是给被终止线程finalize的机会.
     *
     * 错误思路:
     * 直接使用stop()杀死线程. 或者用System.exit()终止整个程序. stop()在 java 1.2 时被弃用.
     *
     * 正确思路:
     * 设计一个后台监控的类, 里面有一个线程的成员变量, 用一个死循环loop重复这个过程, 设置sleep, 每秒log一次并放入logHistory里面.
     * 当程序出现异常, 打断监控, 记录异常信息进入logHistory并且终止监控.
     *
     * */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n ============= Case 1 ==============\n");
        Monitor m1 = new Monitor();
        m1.startMonitoring();
        Thread.sleep(10000); // 10s 后意外打断
        m1.monitorThread.interrupt(); // 模拟外部意外打断.
        m1.monitorThread.join();
        m1.printLog();

        System.out.println("\n ============= Case 2 ==============\n");
        Monitor m2 = new Monitor();
        m2.startMonitoring();
        Thread.sleep(8000); // 8s 后人工停止
        m2.stopMonitoring(); // 模拟人工收到停止.
        m2.monitorThread.join();
        m2.printLog();
    }
}

class Monitor {
    Thread monitorThread;
    List<String> logHistory;
    boolean manuallyStopped;

    Monitor() {
        manuallyStopped = false;
        logHistory = new ArrayList<>();
        monitorThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) { // use isInterrupted as loop condition
                // creates log info:
                DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime now = LocalTime.now();
                String timeString = now.format(f);
                logHistory.add(timeString + " : System is running normal.");

                // wait for 1 sec
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // if detected an interrupt when sleeping, manually interrupt again.
                    Thread.currentThread().interrupt();
                    now = LocalTime.now();
                    timeString = now.format(f);
                    if (manuallyStopped) {
                        logHistory.add(timeString + " Manually stopped by supervisor");
                    } else {
                        logHistory.add(timeString + " An unknown error occur, the monitor is terminated.");
                    }
                    break;
                }
            }
        });
    }

    void startMonitoring() {
        if (monitorThread.getState() == Thread.State.NEW) { // 比对线程当前状态和State的枚举值中的NEW
            monitorThread.start();
        } else {
            System.out.println("Monitor is already on."); // 避免重复开启线程
        }
    }

    void stopMonitoring() {
        manuallyStopped = true;
        monitorThread.interrupt();
    }

    void printLog() {
        System.out.println("Log history: ");
        for (String log : logHistory) {
            System.out.println(log);
        }
    }

}
