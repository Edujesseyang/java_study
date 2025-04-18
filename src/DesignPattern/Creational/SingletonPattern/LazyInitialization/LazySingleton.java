package src.DesignPattern.Creational.SingletonPattern.LazyInitialization;

class LazySingleton {
    /*
    Approach 2:
    1. 构造器私有.
    2. 私有本类成员变量.
    3. 提供一个公共端口, 需要的时候延迟创建, 并且此端口只可使用一次.

    优点：线程安全
      缺点：性能低（synchronized 开销）
    * */

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}