package LinkedList;

			// Assignment 2

public class Main2 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtPos(5, 0); 
        linkedList.insertAtPos(10, 1); 
        linkedList.insertAtPos(15, 2); 

        // Perform operations on the linked list
        boolean isFound = linkedList.searchNode(10); 
        System.out.println("Is node with value 10 found in the linked list? " + isFound);
        
        
        // Create a stack
        Stack stack = new Stack();
        stack.push(20); 
        stack.push(25);
        int topE = stack.peek(); 
        System.out.println("Top element of the stack: " + topE);

        int poppedElement = stack.pop(); 
        System.out.println("Popped element from the stack: " + poppedElement);
        
        int topE1 = stack.peek(); 
        System.out.println("Top element of the stack: " + topE1);
    }
}