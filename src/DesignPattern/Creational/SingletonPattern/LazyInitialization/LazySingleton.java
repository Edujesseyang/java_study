package src.DesignPattern.Creational.SingletonPattern.LazyInitialization;

/*
1. 构造器私有.
2. 私有本类成员变量.
3. 提供一个公共端口, 需要的时候延迟创建, 并且此端口只可使用一次.

* */
class LazySingleton {

    /*
        Approach 1: (不推荐)
        无锁, 线程不安全, 虽然时一个私有构造器了, 并且留了实例化访问点, 在访问时实例化,
        但是, 线程不安全, 如果线程1在if中还未创建时, 线程2刚创建了一个, 就会重复创建.
     */
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}


class LazySingleton1 {
    /*
        Approach 2: (不推荐)
        有线程锁, 在访问点上面, 每次调用 getInstance()，都要加锁（synchronized 方法级别），
        即使对象已经创建好了，这样会导致不必要的性能开销，特别是在高并发场景中。
    */

    private static LazySingleton1 instance;

    private LazySingleton1() {
    }

    public static synchronized LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}

class LazySingleton2 {
    /*
        Approach 3: (推荐)
    1. 双重检查锁定（Double‑Check Locking，双重检查锁定）在第一次判断后才进入同步块，这样在实例已创建后，大多数调用只做一次空判断即可，减少了同步开销。
    2. volatile 关键字保证：
        1) 构造函数执行完毕后，写入 instance 的操作对所有线程立即可见。
        2) 禁止指令重排序，避免其他线程看到“半初始化”对象。
    */
    private static volatile LazySingleton2 instance; // volatile 关键字是为了防止指令重排（instruction reordering）。

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance() {
        if (instance == null) {  // 判断1(无锁) : 避免不必要的同步, 提高效率.
            synchronized (LazySingleton2.class) { // 同步...
                if (instance == null) {  // 第二次判断(有锁) : 保证线程安全.
                    instance = new LazySingleton2(); // 实例
                }
            }
        }
        return instance;
    }
}

class LazySingleton4 {
    /*
        Approach 4:
        静态内部类:
        JVM 保证类加载线程安全，Holder 只有在第一次调用 getInstance() 时才加载。
        无需加锁，性能高，写法也简单。
     */
    private LazySingleton4() {
    }

    private static class Holder {
        static final LazySingleton4 INSTANCE = new LazySingleton4();
    }

    public static LazySingleton4 getInstance() {
        return Holder.INSTANCE;
    }
}