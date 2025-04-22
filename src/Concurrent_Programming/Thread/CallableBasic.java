package src.Concurrent_Programming.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableBasic {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // FutureTask 是 Java 并发包里一个很重要的中间件类，它结合了 Runnable 和 Future 两种能力，是 “可执行 + 可获取结果” 的多线程任务对象。
        // FutureTask 是一个同时实现了 Runnable 和 Future 的类， 它能被丢进线程中运行，也能在外部获取运行结果或取消任务。
        FutureTask<String> task = new FutureTask<>(new Callable<>() { // 后面必须要有Callable 的实例传入.
            @Override
            // 在匿名内部类中复写call方法
            public String call() throws Exception {
                System.out.println("Task 1 is working, hold on.");
                Thread.sleep(5000); // sleep 为等待, 这里是5000毫秒
                System.out.println("Done.");
                return "I am done the answer is : I DON'T KNOW."; // return的值可以被外部接收
            }
        });

        // lambda 的写法, 将new Callable 到Exception之间的都省掉
        FutureTask<Integer> task2 = new FutureTask<>(() -> {
            System.out.println("Task 2: I am working hard.");
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        });

        Thread t1 = new Thread(task, "Thread 1"); // 将FutureTask作为参数传入线程
        t1.start();
        Thread t2 = new Thread(task2, "Thread 2");
        t2.start();

        try { // 因为FutureTask要求显式出来错误, 所以这里可以用try来做错误处理.
            String result = task.get();
            System.out.println("Thread 1 Respond: " + result);
        } catch (ExecutionException | InterruptedException e) { // 执行出错 | 执行被打断
            Throwable cause = e.getCause(); // getCause() 可以接收错误信息.
            System.out.println(cause.toString());
        }

        try {
            Integer num = task2.get();
            System.out.println("Thread 2 Respond: " + num);
        } catch (ExecutionException | InterruptedException e) {
            Throwable problem = e.getCause();
            System.out.println(problem.toString());
        }
    }
}
