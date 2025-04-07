package src.DataStructure.LinkedList;

public class LinkList<T> {
    private static class Node<T> {
        private T value;
        private Node<T> next;

        private Node() {
        }

        private Node(T value) {
            this.value = value;
        }

        private T getValue() {
            return this.value;
        }

        private void set(T value) {
            this.value = value;
        }
    }

    private Node<T> head;

    LinkList() {
        head = null;
    }

    void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        }
        Node<T> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(value);
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
