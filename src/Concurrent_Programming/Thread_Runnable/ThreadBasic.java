package src.Concurrent_Programming.Thread_Runnable;

class ThreadBasic {
    public static void main(String[] args) {
        /*
            开新线程, 利用匿名内部类的写法, 创建Thread 的子类, 并且覆盖run()
        */
        Thread t = new Thread() {
            public void run() {
                this.setName("Tread 1: ");
                System.out.println(this.getName() + ": Running in Thread 1 ...");
                System.out.println(this.getName() + ": Running in Thread 1 .......");
                System.out.println(this.getName() + ": Running in Thread 1 ..............");
            }
        };

        // lambda 写法:
        Thread t2 = new Thread(() -> System.out.println("Thread 2 : Running in Thread 2 ..."));
        // 或者:
        Thread t3 = new Thread(() -> {
            Thread.currentThread().setName("Thread 3: ");
            System.out.println(Thread.currentThread().getName() + ": Running in Tread 3 ...");
        });


        t.start(); // 启动线程
        t2.start(); // 启动线程
        t3.start(); // 启动线程
        System.out.println("Main Thread : Running in main.");

        // 注意这里, 当主线程结束后, 其他线程如果还在工作, jvm会保持运行直到他们都结束.
        // 这时如果其他线程中有无限循环loop, jvm会一直烧cup.
        System.out.println("Main Tread is done.");


        // 一个多线程的测试. t1和t2 分别运行两个死循环, 打印不同的东西. 可以看到他们是穿插打印的.
        Thread loop1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Loop 1:  --------");
            }
        });
        Thread loop2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Loop 2: +++++++");
            }
        });
        // 当存在这种死循环进程时, 可以用在terminal, 输入 jps 查看所有进程, 并且用  taskkill /F /PID XXXXXX 来强制关闭该进程

        loop1.start();
        loop2.start();
    }
}

