package src.OOP_Use.Usage_Singleton;

    // When the program running, this class will automatically instant an object as a singleton..
public class EagerSingleton {
    // create instance obj as a member variable before class
    private static final EagerSingleton instance = new EagerSingleton();

    // hide constructor, prevent instance from outside
    private EagerSingleton() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    // provide universe interface to allow outside to instant the class
    public static EagerSingleton getInstance() {
        return instance;
    }
}

