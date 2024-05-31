package ToDoList;

				// Assignment 1

//ToDoList Class
class ToDoList {
	 private Node head;
	
	 public void addToDo(Task task) {
	     if (head == null) {
	         head = new Node(task);
	     } else {
	         Node current = head;
	         while (current.getNext() != null) {
	             current = current.getNext();
	         }
	         current.setNext(new Node(task));
	     }
	 }
	
	 public void markToDoAsCompleted(String title) {
		    Node current = head;
		    while (current != null) {
		        if (current.getTask().getTitle().equals(title)) {
		            current.getTask().markCompleted();
		            break;
		        }
		        current = current.getNext();
		    }
		    System.out.println("Task not found");
		}

	 public void viewToDoList() {
		    Node current = head;
		    System.out.println("To-Do List: ");
		    while (current != null) {
		        Task task = current.getTask();
		        System.out.println("Title: " + task.getTitle() + " | Description: " + task.getDescription() + " | Completed: " + (task.isCompleted() ? "Yes" : "No"));
		        current = current.getNext();
		    }
		}
}