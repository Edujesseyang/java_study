package src.DataStructure.ArrayList;

public class MyArrayList<T> {
    private T[] baseArr;
    private int size;
    private int length;

    @SuppressWarnings("unchecked")
    public MyArrayList(Class<T> clazz) {
        this.size = 20;
        this.length = 0;
        baseArr = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
    }

    public int length() {
        return this.length;
    }

    public void add(T val) {

    }

    public boolean contains(T val) {


        return false;
    }

    public boolean delete(T val) {

        return false;
    }

    public T elementAt(int index){


    }

}
