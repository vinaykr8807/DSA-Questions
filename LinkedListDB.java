class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Constructor to initialize an empty linked list
    LinkedList() {
        head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to delete a node at the beginning of the linked list
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty. Deletion is not possible.");
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null; // Disconnect the deleted node from the list
    }

    // Method to display the elements of the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListDB {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.insertAtBeginning(3);
        myList.insertAtBeginning(2);
        myList.insertAtBeginning(1);

        System.out.println("Original Linked List:");
        myList.display();

        myList.deleteAtBeginning();
        System.out.println("Linked List after deleting the first node:");
        myList.display();
    }
}
