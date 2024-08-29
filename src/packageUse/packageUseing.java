package src.packageUse;

// import package: To use class in different package, we have to import package first.
// Under same package, no need to import.
import src.packageUse.sonPackage.Cat;

import src.ExtendsUse.People;
import src.classBasic1.Student;

public class packageUseing {

    Cat c1 = new Cat();
    People P1 = new People();
    Student s1 = new Student();

    // if there is another class in this project, we need to use the full name to create the class. Can import same class.
    src.packageUse.sonPackage.Student s2 = new src.packageUse.sonPackage.Student();
}
