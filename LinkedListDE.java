// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {
//     Node head;

//     LinkedList() {
//         head = null;
//     }

//     // Method to insert a node at the end of the linked list
//     void append(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node current = head;
//         while (current.next != null) {
//             current = current.next;
//         }
//         current.next = newNode;
//     }

//     // Method to delete the last node from the linked list
//     void deleteEnd() {
//         if (head == null || head.next == null) {
//             head = null;
//             return;
//         }

//         Node current = head;
//         while (current.next.next != null) {
//             current = current.next;
//         }
//         current.next = null;
//     }

//     // Method to display the linked list
//     void display() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }
// }

// public class LinkedListDE {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
        
//         // Insert elements into the linked list
//         list.append(1);
//         list.append(2);
//         list.append(3);
//         list.append(4);
        
//         System.out.println("Original Linked List:");
//         list.display();
        
//         // Delete the last node
//         list.deleteEnd();
        
//         System.out.println("Linked List after deleting the last node:");
//         list.display();
//     }
// }
