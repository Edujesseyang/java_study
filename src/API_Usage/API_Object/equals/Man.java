package src.API_Usage.API_Object.equals;


import java.util.Objects;

public class Man {
    private String name;
    private int age;

    public Man() {
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // way1:
//    @Override
//    public boolean equals(Object o) {
//            if (o instanceof Man o2) {
//                return (this.name.equals(o2.name)) && (this.age == o2.age);
//            }
//        }
//        return false;
//    }

    // way2: use getClass.
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Man man = (Man) o;
//        return getAge() == man.getAge() && Objects.equals(getName(), man.getName());
//    }

    // way3: use instanceof.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man man)) return false;
        return getAge() == man.getAge() && Objects.equals(getName(), man.getName());
    }

}
