package src.DataStructure.ArrayList;

import java.util.Arrays;

class MyArrayList<T> {
    private T[] baseArr;
    private int size;
    private int length;
    private final Class<T> clazz;

    @SuppressWarnings("unchecked")
    MyArrayList(Class<T> clazz) {
        this.size = 20;
        this.length = 0;
        this.clazz = clazz;
        baseArr = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
    }

    int length() {
        return this.length;
    }

    void add(T val) {
        if (length == size) {
            resize();
        }
        baseArr[length] = val;
        length++;
    }

    boolean contains(T val) {
        for (int i = 0; i < length; i++) {

            if (val == null ? baseArr[i] == null : baseArr[i].equals(val)) {
                return true;
            }
        }
        return false;
    }

    boolean delete(T val) {
        int i = 0;
        while (i < length) {
            if (val == null ? baseArr[i] == null : baseArr[i].equals(val)) {
                remove(i);
                return true;
            }
            i++;
        }

        return false;
    }

    void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index of of Boundary.");
        }
        for (int i = index; i < length - 1; i++) {
            baseArr[i] = baseArr[i + 1];
        }
        baseArr[--length] = null;
    }

    T elementAt(int index) {
        return baseArr[index];
    }

    private void resize() {
        this.size *= 2;
        baseArr = Arrays.copyOf(baseArr, size / 2);
    }

    private T[] toArray() {
        return baseArr;
    }
}
