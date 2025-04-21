package src.DesignPattern.Creational.SingletonPattern.LazyInitialization;

import java.util.ArrayList;

class Exp_Logger {
    // 私有本类变量
    private static volatile Exp_Logger instance;
    private static ArrayList<String> logHistory;

    // 私有化构造器
    private Exp_Logger() {
        logHistory = new ArrayList<>();
    }

    // 向外暴露,
    public static Exp_Logger getInstance() {
        // 线程锁, 保证一个时间只有一个线程可以的实例化
        if (instance == null) {
            synchronized (Exp_Logger.class) {
                if (instance == null) {
                    instance = new Exp_Logger();
                }
            }
        }
        return instance;
    }

    // log
    public void log(String s) {
        if (s != null) {
            synchronized (logHistory) {
                System.out.println(s);
                logHistory.add(s);
            }
        }
    }

    // print history
    public void printHistory() {
        synchronized (logHistory) {
            for (String s : logHistory) {
                System.out.println(s);
            }
        }
    }
}
