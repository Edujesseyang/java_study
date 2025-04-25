package src.Concurrent_Programming.Interrupt_getStatus;

class Interrupt_getStatus {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n******** Test 1 ********");
        test1();
        System.out.println("\n******** Test 2 ********");
        test2();

    }

    private static void test1() throws InterruptedException {
        /*
            逻辑流程:
            1. 建立一个线程并让他休眠.
            2. 查看线程状态, 此时为new, 已存在但并未运行.
            3. 运行线程, 查看状态为runnable.
            4. 等待0.1s 查看状态, 此时为timed_wait, 正在休眠.
            5. 打断休眠, t1会继续运行直到完成.
            6. 最后查看状态, 此时为terminated, 线程结束.
         */
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("T1 is done.");
        });
        System.out.println("t1 : " + t1.getState()); // status: new
        t1.start(); // 开始运行t1
        System.out.println("t1 : " + t1.getState()); // status: runnable

        Thread.sleep(100);
        System.out.println("t1 : " + t1.getState()); // status: Time_wait 此时进入t1休眠

        t1.interrupt(); // 打断t1, throw InterruptedException
        System.out.println("Check if it is interrupted : " + t1.isInterrupted()); // true,

        System.out.println("t1 : " + t1.getState()); // status: terminated,

    }

    private static void test2() throws InterruptedException {
        /*
            这个测试是打断一个在线程中的 while(true) loop.
            逻辑流程:
            1. 在一个线程中建一个死循环.
            2. 在主线程中启动线程t.
            3. 主线程休眠3秒.
            4. 主线程尝试打断线程t.
            5. 线程t接受到外部打断, isInterrupted变为true. 则退出循环.

            注意: 线程外面没有办法直接操纵线程内部的运行情况, 只有通过改变线程中成员变量的方法, 让线程内部"感知"到外部打断.
                 从而推出循环或做其他操作.
        */
        Thread t1 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) { // 可以作为while的判断条件.
                    break;
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // 如果是在休眠时被打断的, 那么该thread的成员变量不会被标为true. 打断休眠会使该线程回到runnable状态并继续工作.
                    // 所以我们可以在这里判断, 如果休眠时被打断, 手动再打断一次使其标为true.
                    Thread.currentThread().interrupt();
                    System.out.println("Sleep is interrupted.");
                }
                System.out.println("t1 is working...");
            }
            System.out.println("Im done.");
        });
        t1.start();
        Thread.sleep(3000); // 0.1 秒后打断
        System.out.println("main start interrupting t1 ... ");
        t1.interrupt();
    }
}
