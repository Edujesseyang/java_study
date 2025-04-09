package src.DataStructure.LinkedList;

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
    private int length = 0;

    LinkList() {
        head = null;
    }

    int getLength() {
        return this.length;
    }

    void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            this.length++;
            return;
        }
        Node<T> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        newNode.setIndex(this.length);
        current.next = newNode;
    }

    boolean delete(int val) {
        if (head.getValue().equals(val)) {
            this.head = head.next;
            this.length--;
            return true;
        }

        Node<T> current = head;
        while (current != null) {
            if (current.next.getValue().equals(val)) {
                current.next = current.next.next;
                this.length--;
                return true;
            }
            current = current.next;
        }
        return false;
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
}
