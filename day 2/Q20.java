public class Q20 {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node merge(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
    }

    static void display(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(4);
        a.next.next = new Node(7);

        Node b = new Node(2);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(9);

        Node result = merge(a, b);

        display(result);
    }
}
