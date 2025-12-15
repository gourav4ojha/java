import java.util.*;

public class ll_duplicate_delate {
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

        // 🔥 Delete duplicates using HashSet
        void deleteDuplicates() {
            Set<Integer> set = new HashSet<>();

            Node curr = head;
            Node prev = null;

            while (curr != null) {
                if (set.contains(curr.data)) {
                    prev.next = curr.next; // delete node
                } else {
                    set.add(curr.data);
                    prev = curr;
                }
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(4);
        ll.add(5);
        ll.add(8);
        ll.add(4);
        ll.add(9);
        ll.add(3);
        ll.add(8);
        ll.add(1);

        System.out.print("Original: ");
        ll.display();

        ll.deleteDuplicates();

        System.out.print("After deleting duplicates: ");
        ll.display();
    }
}
