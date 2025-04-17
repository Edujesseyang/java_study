package src.OOP_Use.accessModifier.differentPackage;

import src.OOP_Use.accessModifier.defaultAccessible;

public class childClassForProtect extends defaultAccessible {

    public void accessChildProtected() {
        // access the protect member.
        childClassForProtect c = new childClassForProtect();
        System.out.println(c.member2);
    }
}
