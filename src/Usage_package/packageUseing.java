package src.Usage_package;

// import package: To use class in different package, we have to import package first.
// Under same package, no need to import.
import src.Usage_package.sonPackage.Cat;

import src.keyword_Extends.People;
import src.classBasic1.Student;

public class packageUseing {

    Cat c1 = new Cat();
    People P1 = new People();
    Student s1 = new Student();

    // if there is another class in this project, we need to use the full name to create the class. Can import same class.
    src.Usage_package.sonPackage.Student s2 = new src.Usage_package.sonPackage.Student();
}
