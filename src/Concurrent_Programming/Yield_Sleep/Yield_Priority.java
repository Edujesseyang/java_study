package src.Concurrent_Programming.Yield_Sleep;

class Yield_Priority {
    /*
        1. 如果在没有yield的情况下, 每一个thread的priority 都是5, (1-10).
        这时两个进程应该长不多同时结束, 每一个时间切片有一些运算然后一替一片的算.

        2. 如果在某一个tread的runnable 方法中加入了yield, 那么他每次都会优先把CPU使用权让给其他线程.
        导致线程一会先完成, 之后线程2才开始全力工作.

        3. 而如果将两个线程的优先级更改, 也会一定程度上的影响二者的CPU时间切片分配. 但不是绝对, 最终决定还是会被java的线程分配机制所左右.

        注意: 这两种优先级的管理办法并不是百分之百的精确. 起决定性作用的还是底层CPU资源分配机制.
    */

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            int count = 0;
            while (count < 10000) {
                System.out.println("1. " + count++);
            }
        });

        Thread t2 = new Thread(() -> {
            int count = 0;
            while (count < 10000) {
                Thread.yield(); // 使t2倾向于让出时间切片.
                System.out.println("          2. " + count++);
            }
        });
        t1.setPriority(10); // 设置优先级.
        t2.setPriority(1);

        t1.start();
        t2.start();

    }
}
