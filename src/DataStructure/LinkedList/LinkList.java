package src.DataStructure.LinkedList;

import java.lang.reflect.Array;

public class LinkList<T> {
    private static class Node<T> {
        private T value;
        private Node<T> next;
        private int index;

        private Node() {
        }

        private Node(T value) {
            this.value = value;
        }

        private T getValue() {
            return this.value;
        }

        private void setValue(T value) {
            this.value = value;
        }

        private int getIndex() {
            return this.index;
        }

        private void setIndex(int index) {
            this.index = index;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int length = 0;
    private final Class<T> clazz;

    LinkList(Class<T> clazz) {
        this.clazz = clazz;
        this.head = null;
    }

    int getLength() {
        return this.length;
    }

    void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            length = 1;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        newNode.setIndex(length);
        length++;
    }

    boolean delete(T val) {
        if (head == null) {
            return false;
        }

        if (head.getValue().equals(val)) {
            this.head = head.next;
            this.length--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.getValue().equals(val)) {
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                this.length--;
                reIndexing(current.getIndex());
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void insert(int index, T val) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Out of bound");
        }

        Node<T> newNode = new Node<>(val);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        if (tail == null || newNode.next == null) {
            tail = newNode;
        }

        length++;
        reIndexing(index);
    }

    T get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("out of bound");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getValue();
    }

    void removeAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Out of bound");
        }

        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node<T> nodeToRemove = current.next;
            current.next = nodeToRemove.next;

            if (nodeToRemove == tail) {
                tail = current;
            }
        }
        length--;
        reIndexing(index);
    }

    int indexOf(T val) {
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(val)) {
                return current.getIndex();
            }
            current = current.next;
        }
        return -1;
    }

    void print() {
        Node<T> current = head;
        System.out.print("{");
        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.next;
        }
        System.out.println("}");
    }

    void printIndex() {
        Node<T> current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print("(" + current.getIndex() + "): " + current.getValue() + ", ");
            current = current.next;
        }
        System.out.println("]");
    }

    void reIndexing(int start) {
        if (start < 0 || start >= this.length) {
            throw new IndexOutOfBoundsException("Out of bond.");
        }

        Node<T> current = head;
        for (int i = 0; i < start; i++) {
            current = current.next;
        }

        while (current != null) {
            current.setIndex(start++);
            current = current.next;
        }
    }

    T[] toArray() {
        @SuppressWarnings("unchecked") T[] arr = (T[]) Array.newInstance(clazz, length);
        Node<T> current = head;
        int counter = 0;
        while (current != null) {
            arr[counter++] = current.getValue();
            current = current.next;
        }
        return arr;
    }
}
