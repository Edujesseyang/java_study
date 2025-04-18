package src.DesignPattern.Creational.SingletonPattern.EagerInitialization;

/*
        特点:
        初始化速度很快, 占用内存较小, 线程安全.
*/

class EagerSingleton {
    // 1. 公共静态本类成员常量, 并且已经初始化好的
    public static final EagerSingleton INSTANCE = new EagerSingleton();

    // 2. 构造器私有化!
    private EagerSingleton() {
    }
}

class EagerSingleton2 {
    // 1. 私有静态本类常量, 并初始化.
    private static final EagerSingleton2 INSTANCE = new EagerSingleton2();

    // 2. 私有化构造
    private EagerSingleton2() {
    }

    // 3. 公共静态入口获取常量
    public static EagerSingleton2 getInstance() {
        return INSTANCE;
    }
}

class EagerSingleton3 {
    // 1. 私有静态本类成员变量, 初始为null
    private static EagerSingleton3 instance = null;

    // 2. 静态代码块：在类加载时执行，确保线程安全地初始化唯一实例
    static {
        instance = new EagerSingleton3();
    }

    // 3. 私有化构造器
    private EagerSingleton3() {
    }

    // 4. 开放入口给外部调用
    public static EagerSingleton3 getInstance() {
        return instance;
    }
}