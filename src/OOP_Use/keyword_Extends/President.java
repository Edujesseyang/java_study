package src.OOP_Use.keyword_Extends;


// make singleton class as president. only allow to create one object.
public class President {
    private static final President instance = new President();
    private final String name;
    private final int age;
    private final char sex;

    private President() {
        if (instance != null) {
            throw new IllegalStateException("Object already installed!!");
        } else {
            this.name = "Jesse Boss";
            this.age = 50;
            this.sex = 'M';
        }
    }

    public static President getInstance() {
        return instance;
    }

    public void printInfo(){
        System.out.println("President: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
    }
}
