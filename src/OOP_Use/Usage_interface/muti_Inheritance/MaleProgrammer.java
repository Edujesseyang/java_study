package src.OOP_Use.Usage_interface.muti_Inheritance;

// key: for interface, they can extend more than one father. it will carry all rules from all fathers.
public interface MaleProgrammer extends Male, Programmer {
    void hateShower();
    void coding(); // there is a method with same name in father. they don't fight.
}
