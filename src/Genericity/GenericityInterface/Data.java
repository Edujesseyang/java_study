package src.Genericity.GenericityInterface;

public interface Data<E> {
    void add();

    void delete(int id);

    void update(E e);

    void update(String s);

    E queryById(int id);

}
