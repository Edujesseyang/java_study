package src.codeBlock;

public class demo {
    public static int counter; // define static member variables here

    private final String name; // final make this variable can not be changed.

    static {
        /* This is a static code block, auto executed, belong to class
         * Use for initialize the static methods and members
         * run before other methods
         */
        counter = 0; // init member variables here
    }

    public String getName() {
        return this.name;
    }

    {
        /* This is instants code block, use for pack the instants method and members.*/
        // execute before constructors.
        name = "Default Name"; // initialize the member variable.
    }

    public static void main(String[] args) {
        demo d1 = new demo();
        System.out.println(d1.getName());
    }
}
