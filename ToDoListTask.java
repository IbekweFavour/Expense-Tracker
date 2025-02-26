import java.util.ArrayList;
import java.util.Scanner;
import java.util.DateTime;

class Task {
    String description;
    boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public void markAsComplete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return (isComplete ? "[X] " : "[ ] ") + description;
    }
}

public class ToDoListManager {
    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as complete");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
                addTask();
            } else if (choice == 2) {
                viewTasks();
            } else if (choice == 3) {
                markTaskComplete();
            } else if (choice == 4) {
                deleteTask();
            } else if (choice == 5) {
                running = false;
                System.out.println("Exiting... Goodbye!");
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task: ");
        String taskDescription = scanner.nextLine();
        tasks.add(new Task(taskDescription));
        System.out.println("Task added!");
    }
    
private static void viewTasks() {
    if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
      } else {
         System.out.println("\nYour Tasks:");
            for (int item = 0; item < tasks.size(); item++) {
                System.out.println((item + 1) + ". " + tasks.get(i));
            }
        }
    }
 private static void markTaskComplete() {
        viewTasks();
        if (tasks.isEmpty()) return;
        
        System.out.print("Enter task number to mark as complete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); 
        
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.get(taskNumber - 1).markAsComplete();
            System.out.println("Task marked as complete!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
private static void deleteTask() {
    viewTasks();
        if (tasks.isEmpty()) return;
        
        System.out.print("Enter task number to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); 
        
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}