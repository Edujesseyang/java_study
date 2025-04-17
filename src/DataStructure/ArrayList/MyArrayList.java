package src.DataStructure.ArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] baseArr;
    private int size;
    private int length;
    private Class<T> clazz;

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
        if (length == size) {
            resize();
        }

        if (length == 0) {
            baseArr[0] = val;
        } else {
            baseArr[length - 1] = val;
        }
        length++;
    }

    public boolean contains(T val) {


        return false;
    }

    public boolean delete(T val) {

        return false;
    }

    public T elementAt(int index) {

        return null;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        this.size *= 2;
        T[] newArr = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        newArr = Arrays.copyOf(baseArr, size / 2);
    }
}
