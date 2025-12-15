import java.util.*;

public class ll_duplicate {

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

        LinkedListCustom list = new LinkedListCustom();

        list.add(2);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(6);

        list.display();

        Set<Integer> set = new HashSet<>();
        Node temp = list.head;

        System.out.print("Duplicate elements: ");
        while (temp != null) {
            if (set.contains(temp.data)) {
                if(temp.next.next != null)temp.next=temp.next.next;
                else temp.next=null;
            } else {
                set.add(temp.data);
            }
            temp = temp.next;
        }
        while (list.head.next != null) {
        	System.out.println(list.head.data);
        	list.head=list.head.next;
        }
    }
}
