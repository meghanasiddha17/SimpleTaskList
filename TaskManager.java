import java.util.Scanner;

public class TaskManager {
    private static TaskList taskList = new TaskList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nTask Manager");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. List all tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        taskList.addTask(description);
        System.out.println("Task added.");
    }

    private static void removeTask() {
        System.out.print("Enter task number to remove: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        taskList.removeTask(taskNumber - 1);
    }

    private static void listTasks() {
        System.out.println("\nTask List:");
        taskList.listTasks();
    }
}
