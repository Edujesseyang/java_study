package src.Concurrent_Programming.ThreadContextSwitch;

public class ThreadContextSwitch {
    /*
       导致线程上下文切换的原因:
       1. CPU 时间片用完.
       2. 垃圾回收触发.
       3. 让给更高优先级的线程.
       4. 自然结束线程, 比如: sleep, yield, join, park, synchronized, lock 等方法被调用.

    */
    public static void main(String[] args) {
        Thread t1 = new Thread("Thread 1") {
            @Override
            public void run() {
                System.out.println("t1 : Is running...");
            }
        };

        t1.run(); // 这里的run 方法并不会真的实现多线程并行, 下面的sout 还是会等待t1完成执行后再继续执行.
        System.out.println("Do this... ");

        Thread t2 = new Thread("Thread 1") {
            @Override
            public void run() {
                System.out.println("t2 : Is running...");
            }
        };

        t2.start(); //而用start 就可以让t2线程执行时, 主线程继续向下执行, 不必等待t2 结束.
        System.out.println("Now do this...");
    }
}
