package src.Concurrent_Programming.Yield_Sleep;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class Join {
    // join 是用来等待该线程返回值.
    public static void main(String[] args) throws InterruptedException {
        /* PART 1:
         * 这个test测试了两种方法求1-10000的和, 一个方法是 一个loop加全部, 另一个方法是用两个线程分别加总质数和偶数.
         * 这个测试通常不会得到我们想要看到的结果, 因为线程的开合加上条件判断远远超过单线程直接计算所花的时间.
         * 最后结果应该是双线程明显慢于单线程.
         * */
        System.out.println("Test1: single thread");
        System.out.println("Answer : " + test1(1000000));
        System.out.println("Time : " + getAvgTime(1, 500, 1000000) / 1000 + " ms.");

        Thread.sleep(1000);

        System.out.println("Test1: dou thread");
        System.out.println("Answer : " + test2(1000000));
        System.out.println("Time : " + getAvgTime(2, 500, 1000000) / 1000 + " ms.");


        /* PART 2:
           join() 如果传入参数代表他将变成一个有限等待的join(), 等待 n ms之后即继续向下执行,
         * */
        AtomicInteger sum = new AtomicInteger(0); // 推荐用于多线程的data type
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000); // 等待1秒后继续操作
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 1000; i++) {
                sum.addAndGet(i); // 实时更新sum的值, 可用于多线程同时操作sum的值.
            }
        });
        t1.start();
        t1.join(500); // 等待半秒后放弃等待
        System.out.println(sum.get()); // 结果应该是0, 因为主线程只等待了半秒, 并没有等到t1出结果
    }

    private static long getAvgTime(int testId, int times, int maxNum) throws InterruptedException {
        long sumTime = 0;
        long start, end;

        if (testId == 1) {
            for (int i = 0; i < times; i++) {
                start = System.nanoTime();
                test1(maxNum);
                end = System.nanoTime();
                sumTime += end - start;
            }
        }
        if (testId == 2) {
            for (int i = 0; i < times; i++) {
                start = System.nanoTime();
                test2(maxNum);
                end = System.nanoTime();
                sumTime += end - start;
            }
        }
        return sumTime / times;
    }

    private static long test1(int n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    private static long test2(int n) throws InterruptedException {
        AtomicLong oddSum = new AtomicLong(0); // Atomic type 是可以在lambda中自由修改的类, 线程安全.
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < n; i += 2) {
                oddSum.addAndGet(i);
            }
        });

        long[] evenSum = {0}; // 简单实现, 绕过线程的必须input final机制, 线程不安全.
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i += 2) {
                evenSum[0] += i;
            }
        });

        t1.start();
        t2.start();
        t1.join(); // 重点在这,  主线程在此等待t1完成他的任务
        t2.join(); // 等待t2完成他的任务, 这时oddSum和evenSum都已经准备完毕.

        return oddSum.get() + evenSum[0]; // return 两者之和.

    }
}
