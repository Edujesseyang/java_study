package src.Singleton;

    // this design pattern will create an instance whenever outside call the getInstance method.
public class LazySingleton {

    // define a private instance member, but not initiate
    private static LazySingleton instance;

    // hide constructor, prevent instance from outside
    private LazySingleton() {
    }

    // provide interface, let outside to instant the object, whenever needed
    public static LazySingleton getInstance() {
        if (instance == null) {  // Here is the key, only allow outside to instant if instant is null.
            instance = new LazySingleton();
        }
        return instance;
    }
}


