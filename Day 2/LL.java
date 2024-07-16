import java.util.*;

public class LL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // data insertion in the beginning

    public void insertFirst(int newData) {
        Node newNode = new Node(newData);

        // if head /list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // if list is not empty
        Node temp = head;
        head = newNode;
        head.next = temp;
        // newNode.next = head;
        // head = newNode;
        return;
    }

    // inserting at the end of the list
    public void insertEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        return;
    }

    // displaying the list

    public void displayList() {
        if (head == null) {
            System.out.println("the list is empty.");
        } else {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.data + " --> ");
                cur = cur.next;
            }

            System.out.println(" null");
        }
    }

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(5);
        // list.insertFirst(2);
        // list.insertFirst(7);

        // list.displayList();

        // list.insertEnd(3);
        list.insertEnd(70);

        // list.displayList();

        list.insertFirst(400);

        list.displayList();

    }
}
