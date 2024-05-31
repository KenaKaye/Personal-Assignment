package ToDoList;


		// Assignment 1


//Task Class
class Task {
	 private String title;
	 private String description;
	 private boolean completed;
	
	 public Task(String title, String description) {
	     this.title = title;
	     this.description = description;
	     this.completed = false; // Initially set as not completed
	 }
	
	 public String getTitle() {
	     return this.title;
	 }
	
	 public String getDescription() {
	     return this.description;
	 }
	
	 public boolean isCompleted() {
	     return this.completed;
	 }
	
	 public void markCompleted() {
	     this.completed = true;
	 }

}










