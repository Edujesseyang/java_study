package src.Genericity.GenericityInterface;

public class Student implements Data<String> {
    @Override
    public void add() {
        System.out.println("Adding a student record.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting student record with ID: " + id);
    }

    @Override
    public void update(String s) {
        System.out.println("Updating student record with details: " + s);
    }

    @Override
    public String queryById(int id) {
        System.out.println("Querying student record with ID: " + id);

        return "Student Name for ID: " + id;
    }
}
