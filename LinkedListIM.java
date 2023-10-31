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

//     void insertAtMiddle(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//         } else {
//             Node slowPtr = head;
//             Node fastPtr = head;

//             while (fastPtr != null && fastPtr.next != null) {
//                 slowPtr = slowPtr.next;
//                 fastPtr = fastPtr.next.next;
//             }

//             newNode.next = slowPtr.next;
//             slowPtr.next = newNode;
//         }
//     }

//     void display() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//     }
// }

// public class LinkedListIM {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.insertAtMiddle(1);
//         list.insertAtMiddle(2);
//         list.insertAtMiddle(3);
//         list.insertAtMiddle(4);

//         System.out.println("Linked List:");
//         list.display();
//     }
// }
