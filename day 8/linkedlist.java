//  Day 8  7th Question  Build and count a linked list

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head = null;

    void insertFront(int value) {
        Node n = new Node(value);
        n.next = head;
        head = n;
    }

    void insertEnd(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int count() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertFront(10);

        list.display();
        System.out.println("Node count = " + list.count());
    }
}