package src.Concurrent_Programming.Yield_Sleep;

import java.util.concurrent.TimeUnit;

class Sleep_Status {

    public static void main(String[] args) {
        /*
         * 这两种方法是Thread的时间状态控制手段, 可以让线程陷入等待.
         * */

        Thread t1 = new Thread(() -> {
            int count = 0;
            while (count < 10) {
                try {
                    Thread.sleep(500); // 这里没轮loop让线程休眠0.5秒. 这里的单位使毫秒.
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("T1 is counting " + count++);
            }
        });
        System.out.println("T1 status: " + t1.getState()); // 此时的status是new. 新增线程并未运行.
        Thread t2 = new Thread(() -> {
            int count = 0;
            while (count < 10) {
                try {
                    TimeUnit.SECONDS.sleep(1); // 这里用了java自带的TimeUnit的类, 增加可读性
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("                         T2 is counting " + count++);
            }
        });
        System.out.println("                       T2 status: " + t2.getState()); // 此时的status是new. 新增线程并未运行.

        t1.start();
        System.out.println("T1 status: " + t1.getState()); // 此时线程状态为runnable 或 Time_waiting, 取决于当时t1的状态
        t2.start();
        System.out.println("                       T2 status: " + t2.getState()); // 此时线程状态为runnable 或 Time_waiting, 取决于当时t1的状态

        try { // 在这里尝试三秒后打断t2.
            TimeUnit.SECONDS.sleep(3);
            t2.interrupt(); // 如果t2在主线程进行到此是为sleeping 状态, 它会被唤醒并且抛出InterruptedException, 如果在running状态则什么都不会发生.
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("T1 status: " + t1.getState()); // 此时线程状态为runnable或者time_waiting, 取决于当时状态.
        System.out.println("                       T2 status: " + t2.getState()); // 当T2被打断后, 系统状态为blocked



        /*
         * sleep 的实际小应用, 在时候while(true)循环时, cpu通常会占用很多资源, 哪怕我的while循环中只是等待.
         * 这时我们就可以加一个sleep方法让cpu空闲下来.
         * 如果不加sleep, 会陷入忙等(busy-waiting), 持续高速循环,但是每个循环确什么都不做.
         * 加上 Thread.sleep() 之后，线程进入 TIMED_WAITING 状态，CPU 可以调度其他线程，提高整体系统性能。
         * 适用于无锁的后台同步.
         *
         * 例如，下面的代码在每次循环后让线程休眠 1 秒，
         * 这样可以实现低频率运行，减少 CPU 使用率，尤其适合后台定时检查、监听等场景。
         */
        while (true) {
            try {
                Thread.sleep(1000); // 当cpu没个循环休眠1秒, 保持低速运转的同时可以降低使用率.
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
