public class Q18 {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }

    static void display(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed:");
        display(head);
    }
}
