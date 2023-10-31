class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteMiddle() {
        if (head == null || head.next == null) {
            System.out.println("Cannot delete from an empty or single-node list.");
            return;
        }

        Node slowPtr = head;
        Node fastPtr = head;
        Node prevNode = null;

        while (fastPtr != null && fastPtr.next != null) {
            prevNode = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // Delete the middle node
        prevNode.next = slowPtr.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListDM {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original linked list:");
        list.display();

        list.deleteMiddle();

        System.out.println("Linked list after deleting the middle node:");
        list.display();
    }
}
