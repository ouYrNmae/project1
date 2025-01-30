import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        ArrayList<Integer> ints = new ArrayList<>();
//        ints.add(5);
//        ints.add(6);
//        System.out.println(ints);
        System.out.println("""
                Please choose an option:
                (1) Add a task.
                (2) Remove a task.
                (3) Update a task.
                (4) List all tasks.
                (0) Exit.
                """);
        int quit = 0;
        int userResponse = input.nextInt();
        while (quit == 0){
            if (userResponse ==1){
                System.out.println("Add task");
                addTask();

            }
            else if (userResponse ==2){
                System.out.println("Remove task");
            }
            else if (userResponse ==3){
                System.out.println("update task");
            }
            else if (userResponse ==4){
                System.out.println("listing all tasks");
            }
            else {
                System.out.println("exiting");
            }
        }

    }
    static void addTask(){
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("Input a task:");
        String task = input.nextLine();
        tasks.add("task");
        System.out.println("Task added successfully.");
    }
}
