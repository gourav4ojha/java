import java.util.*;

public class ll_alternative_merge {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(4);
        l1.add(6);

        l2.add(1);
        l2.add(3);
        l2.add(5);
        l2.add(7);

        Node p1 = l1.head;
        Node p2 = l2.head;

        while (p1 != null && p2 != null) {
            Node next1 = p1.next;
            Node next2 = p2.next;

            p1.next = p2;

            if (next1 == null) break;

            p2.next = next1;

            p1 = next1;
            p2 = next2;
        }

        l1.display();
    }
}
