package src.API_Object.Objects;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "cat";
        a1.color = "white";

        Animal a2 = new Animal();
        a2.name = "cat";
        a2.color = "white";

        // use Objects.equals(param1, param2) to compare two objects.
        System.out.println(Objects.equals(a1, a2));
        // this is better than
        System.out.println(a1.equals(a2));
        // b/c a1.equals(a2) may have null error

        /*
        here is the java method Objects.equals(a, b):
            public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
            }
        it proven if any a or b is null

        this is a.equals(b):
            public boolean equals(Object obj) {
            return (this == obj);
            }
        it will not check is b is null.
         */

        a1 = null;
        System.out.println(Objects.equals(a1, a2)); // it has warning, but not error
        // System.out.println(a1.equals(a2)); // it will have error, cannot be built.

        // Object.isNull()
        System.out.println(Objects.isNull(a1));  // return true
        System.out.println(Objects.isNull(a2));  // return false
    }
}
