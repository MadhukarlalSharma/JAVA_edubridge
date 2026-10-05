//  Day 8  8th Question  Reverse a Linked List

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node prev = null;
        Node cur = head;
        Node next = null;

        while (cur != null) {
            next = cur.next;   
            cur.next = prev;   
            prev = cur;       
            cur = next;       
        }
        return prev;           
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
      
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Before: ");
        display(head);

        head = reverse(head);

        System.out.print("After : ");
        display(head);
    }
}