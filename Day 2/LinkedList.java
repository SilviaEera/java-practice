import java.util.*;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // inserting in a linked list
    public void insert(LinkedList ls, int newData) {
        Node newNode = new Node(newData);

        // if linked list is empty
        if (ls.head == null) {
            ls.head = new Node(newData);
            return;
        }

        // if linked list is not empty
        else {
            newNode.next = null;
            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = newNode;

        }

        return;

    }

    // displaying linked list
    public void display() {
        Node currentVal = head;
        if (currentVal != null) {
            System.out.print(currentVal.data + "");
            currentVal = currentVal.next;
        }
    }

    public static void main(String args[]) {
        // System.out.println("the quick brown fox jumps over the lazy dog.");
        LinkedList newList = new LinkedList();
        newList.insert(newList, 31);
        newList.insert(newList, 13);
        newList.insert(newList, 3);

        System.err.println("Linked List is :");

        newList.display();

    }

}