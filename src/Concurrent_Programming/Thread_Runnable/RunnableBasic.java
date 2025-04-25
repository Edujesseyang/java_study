package src.Concurrent_Programming.Thread_Runnable;

class RunnableBasic {

    /*
       Runnable 是一个函数式接口, 提供给复写在线程中执行的run方程.
       使用Runnable并传入Thread可以实现线程操作和执行内容的解耦, 使其分离. 增加了使用时的灵活性.
    */
    public static void main(String[] args) {
        // 这是匿名内部类的方法
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am runnable. doing task");
            }
        };

        // 这是lambda表达式的方法
        Runnable task2 = () -> {
            System.out.println("I am runnable. doing task 1");
            System.out.println("I am runnable. doing task 2");
        };
        // 如果只有一行可以直接省略大括号
        Runnable task3 = () -> System.out.println("Too easy..");
        // 也可以线程和Runnable 一起写
        Thread t = new Thread(() -> System.out.println("Best one."));
        t.start();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread done.");
    }

}
