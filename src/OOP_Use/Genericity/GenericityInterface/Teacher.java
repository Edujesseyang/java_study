package src.OOP_Use.Genericity.GenericityInterface;

public class Teacher implements Data<Teacher> {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("Adding a Teacher record.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting Teacher record with ID: " + id);
    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public void update(String s) {
        System.out.println("Updating Teacher record with details: " + s);
    }

    @Override
    public Teacher queryById(int id) {
        System.out.println("Querying Teacher record with ID: " + id);

        return new Teacher();
    }
}