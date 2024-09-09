package src.Genericity.GenericityInterface;

public class test {
    public static void main(String[] args) {
        Data<Student> data1 = new Data<Student>() {
            @Override
            public void add() {

            }

            @Override
            public void delete(int id) {

            }

            @Override
            public void update(Student student) {

            }

            @Override
            public void update(String s) {

            }

            @Override
            public Student queryById(int id) {
                return null;
            }
        };

    }
}
