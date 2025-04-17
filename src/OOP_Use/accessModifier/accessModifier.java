package src.OOP_Use.accessModifier;

import src.OOP_Use.accessModifier.differentPackage.childClassForProtect;
import src.OOP_Use.accessModifier.differentPackage.nonRelatedClass;

public class accessModifier {
    // 4 level of modifier:
    // private => (default) => protect => public

    /*  Range of accessible:

                    within same class          within same package          child class in different package            non-related class in different package
        private :         X

        default :         X                            X

        protected :       X                            X                                X

        public :          X                            X                                X                                               X
    * */

    private String member = "Got this private member! ";

    public static void main(String[] args) {

        // access the private member.
        accessModifier a = new accessModifier();
        System.out.println(a.member);

        // access the default member.
        defaultAccessible d = new defaultAccessible();
        System.out.println(d.member);

        // access the protect member.
        childClassForProtect c = new childClassForProtect();
        c.accessChildProtected(); // protect can only access by the child class

        // access the public member.
        nonRelatedClass n = new nonRelatedClass();
        System.out.println(n.member);
    }

        /*  Rules:
                1. member variable set as private.
                2. method set as public unless special design.
                3. member variable of father class if children class need to access, set as protected.
        */

}
