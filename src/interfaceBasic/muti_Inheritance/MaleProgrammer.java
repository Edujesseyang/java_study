package src.interfaceBasic.muti_Inheritance;

// key: for interface, they can extend more than one father. it will carry all rules from all fathers.
public interface MaleProgrammer extends Male, Programmer {
    void hateShower();
}
