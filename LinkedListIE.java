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

//     // Constructor to initialize an empty linked list
//     public LinkedList() {
//         head = null;
//     }

//     // Method to insert a node at the end of the linked list
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             // If the linked list is empty, set the new node as the head
//             head = newNode;
//         } else {
//             // Traverse to the end of the list
//             Node current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }

//             // Set the new node as the next node of the current last node
//             current.next = newNode;
//         }
//     }

//     // Method to display the linked list
//     public void display() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }
// }

// public class LinkedListIE {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         // Insert nodes at the end
//         list.insertAtEnd(1);
//         list.insertAtEnd(2);
//         list.insertAtEnd(3);

//         // Display the linked list
//         System.out.print("Linked List: ");
//         list.display();
//     }
// }

