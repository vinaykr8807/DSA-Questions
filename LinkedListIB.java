// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {
//     Node head;

//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void display() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }
// }

// public class LinkedListIB {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         // Insert elements at the beginning of the linked list
//         list.insertAtBeginning(3);
//         list.insertAtBeginning(2);
//         list.insertAtBeginning(1);

//         // Display the linked list
//         System.out.println("Linked List after insertion at the beginning:");
//         list.display();
//     }
// }

