//  Day 8  10th Question Merge Two Sorted Linked Lists

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {
    static Node merge(Node a, Node b) {
        Node dummy = new Node(0);   
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } 
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

       
        if (a != null) {
            tail.next = a;
        } 
        else {
            tail.next = b;
        }

        return dummy.next;
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
        Node list1 = build(1, 4, 7);
        Node list2 = build(2, 3, 8, 9);

        System.out.print("List 1 : ");
        display(list1);
        System.out.print("List 2 : ");
        display(list2);

        Node merged = merge(list1, list2);

        System.out.print("Merged : ");
        display(merged);
    }
}