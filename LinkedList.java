package LinkedList;

			// Assignment 2

//LinkedList class to perform operations on the list
class LinkedList {
	 private Node2 head; // Reference to the first node in the linked list
	
	 // Inserting a Node at Any Given Position in a Singly Linked List
	 public void insertAtPos(int data, int position) {
	     Node2 newNode = new Node2(data);
	     if (position == 0) {
	         newNode.next = head;
	         head = newNode;
	     } 
	     else {
	         Node2 temp = head;
	         for (int i = 0; i < position - 1; i++) {
	             if (temp == null) {
	                 throw new IndexOutOfBoundsException("Position is out of bounds");
	             }
	             temp = temp.next;
	         }
	         newNode.next = temp.next;
	         temp.next = newNode;
	     }
	 
	 }
	
	
	//Deleting a Node at Any Given Position in a Singly Linked List
	public void deleteAtPosition(int position) {
		 Node2 temp = head;
		 Node2 prev = null;
		 int count = 0;
		
		 if (position == 0) {
		     head = temp.next;
		     return;
		 }
		
		 while (temp != null && count < position) {
		     prev = temp;
		     temp = temp.next;
		     count++;
		 }
		
		 if (temp == null) {
		     return;
		 }
		
		 prev.next = temp.next;
	}
	
	//Deleting a Node After a Given Node in a Singly Linked List
	public void deleteAfterNode(Node2 prevNode) {
		 if (prevNode != null && prevNode.next != null) {
		     Node2 nodeToDelete = prevNode.next;
		     prevNode.next = nodeToDelete.next;
		     nodeToDelete.next = null; // Optional: Removing the reference to the next node
		 }
	}
	
	//Searching a Node in a Singly Linked List
	public boolean searchNode(int data) {
		 Node2 current = head;
		 while (current != null) {
		     if (current.data == data) {
		         return true; // Node with specific value found
		     }
		     current = current.next;
		 }
		 return false; // Node with specific value not found
	}

}