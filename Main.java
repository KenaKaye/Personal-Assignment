package ToDoList;
	
			// Assignment 1
public class Main {
    public static void main(String[] args) {
        // Create tasks
        Task task1 = new Task("Finish Assignment", "Complete the DSA Assignment.");
        Task task2 = new Task("Chores", "Wash socks");
        // Create a to-do list
        ToDoList toDoList = new ToDoList();

        // Add tasks to the to-do list
        toDoList.addToDo(task1);
        toDoList.addToDo(task2);

        // View the initial to-do list
        toDoList.viewToDoList();

        // Mark a task as completed
        toDoList.markToDoAsCompleted("Finish Assignment");

        // View the updated to-do list
        toDoList.viewToDoList();

       
    }
}
