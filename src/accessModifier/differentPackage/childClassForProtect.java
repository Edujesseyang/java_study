package src.accessModifier.differentPackage;

import src.accessModifier.defaultAccessible;

public class childClassForProtect extends defaultAccessible {

    public void accessChildProtected() {
        // access the protect member.
        childClassForProtect c = new childClassForProtect();
        System.out.println(c.member2);
    }
}
