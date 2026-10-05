public class Q17 {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {

        Node head;

        void insertEnd(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        void insertFront(int data) {

            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        int count() {

            int count = 0;
            Node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }

        void display() {

            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }

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
