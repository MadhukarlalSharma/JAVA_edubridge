//  Day 8  9th Question  Middle of a Linked List

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNode {
    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;     
        }
        return slow;
    }

   
    static Node build(int... values) {
        Node head = new Node(values[0]);
        Node temp = head;
        for (int i = 1; i < values.length; i++) {
            temp.next = new Node(values[i]);
            temp = temp.next;
        }
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node list1 = build(10, 20, 30, 40, 50);
        display(list1);
        System.out.println("Middle = " + findMiddle(list1).data);

        System.out.println();

        Node list2 = build(10, 20, 30, 40, 50, 60);
        display(list2);
        System.out.println("Middle = " + findMiddle(list2).data);
    }
}