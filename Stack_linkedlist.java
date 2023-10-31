// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class Stack {
//     Node top;

//     public Stack() {
//         this.top = null;
//     }

//     // Push operation to insert a value
//     public void push(int value) {
//         Node newNode = new Node(value);
//         newNode.next = top;
//         top = newNode;
//     }

//     // Pop operation to delete the top element
//     public void pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty. Cannot pop.");
//             return;
//         }
//         top = top.next;
//     }

//     // Display the stack
//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty.");
//             return;
//         }
//         Node current = top;
//         System.out.println("Stack elements:");
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     // Check if the stack is empty
//     public boolean isEmpty() {
//         return top == null;
//     }
// }

// public class Stack_linkedlist {
//     public static void main(String[] args) {
//         Stack stack = new Stack();
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("\nChoose an option:");
//             System.out.println("1. Push");
//             System.out.println("2. Pop");
//             System.out.println("3. Display");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");

//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter value to push: ");
//                     int value = scanner.nextInt();
//                     stack.push(value);
//                     break;
//                 case 2:
//                     stack.pop();
//                     break;
//                 case 3:
//                     stack.display();
//                     break;
//                 case 4:
//                     scanner.close();
//                     System.exit(0);
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//     }
// }

