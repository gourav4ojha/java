import java.util.*;

public class ll_operation {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List class
    static class LinkedListCustom {
        Node head;

        // Insert at end
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

        // Delete FIRST occurrence of value
        void delete(int data) {

            // Case 1: empty list
            if (head == null) return;

            // Case 2: head node
            if (head.data == data) {
                head = head.next;
                return;
            }

            Node temp = head;

            // Traverse till next node matches
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }

            // If found
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        // Display list
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

        LinkedListCustom list = new LinkedListCustom();

        list.add(2);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(9);

        System.out.println("Original Linked List:");
        list.display();

        list.delete(9);

        System.out.println("After deleting first 9:");
        list.display();
    }
}
