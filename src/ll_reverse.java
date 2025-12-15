import java.util.*;

public class ll_reverse {

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
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);

        System.out.print("Original: ");
        ll.display();

        Stack<Integer> stk = new Stack<>();

        Node temp = ll.head;
        while (temp != null) {
            stk.push(temp.data);
            temp = temp.next;
        }

        Node temp2 = ll.head;
        while (!stk.isEmpty()) {
            temp2.data = stk.pop();
            temp2 = temp2.next;
        }

        System.out.print("Reversed: ");
        ll.display();
    }
}
