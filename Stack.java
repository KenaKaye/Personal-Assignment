package LinkedList;

				// Assignment 2

//Stack class implemented using a linked list
class Stack {
	 private Node2 top; // Reference to the top element of the stack
	
	 // Push operation to add an element to the stack
	 public void push(int data) {
	     Node2 newNode = new Node2(data);
	     newNode.next = top; // Set the new node's next reference to the current top
	     top = newNode; // Update the top reference to the new node
	 }

	 public int pop() {
		 if (top == null) {
			 return -1;    
		  }
		    
		 int poppedData = top.data; // Retrieve the data from the top node
		 top = top.next; // Update the top reference to the next node
		 return poppedData; // Return the popped data
	}

	// Peek operation to retrieve the top element without removing it
	public int peek() {
		if (top == null) {
	        return -1; 
	    }
	    return top.data; // Return the data of the top node
	}

}
