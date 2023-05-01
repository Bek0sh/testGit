package dataStructures;

public class MyLinkedList {
    Node head;
    private class Node {
        Node next;
        int data;

        public Node (int data) {
            this.data = data;
            next = null;
        }
    }

    public void insert(int newData) {
        Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
    }

    public void delete(int key) {
        Node current = head;

        while (current.next != null) {
            if(current.data == key) {
                current.data = current.next.data;
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}
