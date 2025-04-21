package src.DesignPattern.Creational.SingletonPattern.EagerInitialization;

class Test {
    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.INSTANCE;
        EagerSingleton instance2 = EagerSingleton.INSTANCE;
        System.out.println("Are they equal: " + instance.equals(instance2));
        System.out.println(instance.hashCode()); // 同一个哈希码
        System.out.println(instance2.hashCode()); // 同一个哈希码
        // 这两个instance是一样的, 说明无论创建多少格instance, 都是一样的.


        EagerSingleton2 instance3 = EagerSingleton2.getInstance();
        EagerSingleton2 instance4 = EagerSingleton2.getInstance();
        System.out.println("Are they equal: " + instance3.equals(instance4));
        System.out.println("Check hashCode: " + instance3.hashCode()); // 同一个哈希码
        System.out.println("Check hashCode: " + instance4.hashCode()); // 同一个哈希码
        // 这两个instance是一样的, 说明无论创建多少格instance, 都是一样的.

        EagerSingleton3 instance5 = EagerSingleton3.getInstance();
        EagerSingleton3 instance6 = EagerSingleton3.getInstance();
        System.out.println("Are they equal: " + instance5.equals(instance6));
        System.out.println("Check hashCode: " + instance5.hashCode()); // 同一个哈希码
        System.out.println("Check hashCode: " + instance6.hashCode()); // 同一个哈希码
        // 这两个instance是一样的, 说明无论创建多少格instance, 都是一样的.


    }
}
