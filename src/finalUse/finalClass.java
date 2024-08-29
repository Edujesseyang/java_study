package src.finalUse;

// final for class, means this class can NOT be extended.
public final class finalClass {
    // final for member variable, means its value can NOT be changed.
    // final in java is same as const in C++.
    public final String finalMemberVar = "I can't be changed!";
    public static final int finalInteger = 0;

    // good practice, naming the final variable as all capital letters.
    public final String CONSTANT_CAN_NOT_BE_CHANGED = "I am a constant!";

    // final for method, means the method can NOT be overridden.
    public final void finalMethod() {
        System.out.println("I can't be overridden!");
    }

    public static void main(String[] args) {
        finalClass f = new finalClass();
        // f.finalMemberVar = "I'm changing...";  ERROR.

        final SomeClass s = new SomeClass();  // set a object to a constant reference
        // s = null;   Can't change the reference of object.

    }

    // use final to protect the param
    public static int intMethod(final int input) {
        // input = 12;    --> can't change the param input.
        return input;
    }
}

// class child extends finalClass{    ERROR


//    @Override
//    public void finalMethod(){}    ERROR


// }

class SomeClass {
    public String name;
}