package ToDoList;

 			// Assignment 1
//Node Class for the ToDOList
class Node {
	private Task task;
	private Node next;

	public Node(Task task) {
		this.task = task;
		this.next = null; // Initially set the next node as null
	}

	public Task getTask() {
		return this.task;
	}

	 public void setTask(Task task) {
	     this.task = task;
	 }
	
	 public Node getNext() {
	     return this.next;
	 }
	
	 public void setNext(Node next) {
	     this.next = next;
	 }
}
