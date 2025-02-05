//Jocelin Martinez-Reyes
//Project 1 2/4/25
//add robloc
//add robloc
//add robloc
//add robloc
//add robloc
//add robloc
//add robloc
//add robloc
// looking at other people's code makes me realize how much i actually overthink/overdo with mine (as in lines of code and how for every option i just add extra 😭 --> the if/else staenemtns :p)

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        options();
        
//case switch is so confusing to me TT
//Logan's explantion helped but no, just no
// add robloc
//add robloc
//add robloc

        int quit = 0;
        while (quit == 0) {
            int userResponse = input.nextInt();
            input.nextLine();
            if (userResponse == 1) {
                addTask();
            } else if (userResponse == 2) {
                deleteTask();
            } else if (userResponse == 3) {
                updateTask();
            } else if (userResponse == 4) {
                listTasks();
            } else if (userResponse == 0) {
                quit = 1;
                System.out.println("BYE-BYE\nBYE-BYE\nBYE-BYE");
            } else {
                options();
                System.out.println("Try again bud, that wasn't a choice.\n");
            }
        }
    }


    static void options() {
        System.out.println("""
                Please choose an option:
                (1) Add a task.
                (2) Remove a task.
                (3) Update a task.
                (4) List all tasks.
                (0) Exit.
                """);
    }

    static void addTask() {
        System.out.println("What's the task?");
        String task = input.nextLine();
        tasks.add(task);
        System.out.println("Task has been added :D!\n");
        options();
    }

    static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.\n(Hint: Add a task:>!)");
        } else {
            System.out.println("List of all of your tasks: ");
            for (String task : tasks) {
                System.out.println(task);
            }
        }
        options();
    }

    static void deleteTask() {
        System.out.println("Which task to delete (Note: this is by number not what is in said task)\n");
        listTasks();
        int taskNumber = input.nextInt();
        input.nextLine();

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("The task has been removed!\n");
        } else {
            System.out.println("ERM... That task like doesn't exist.(Hint: Choose an actual task <:)\n");
        }
        options();
    }

    static void updateTask() {
        System.out.println("Which one: ");
        listTasks();
        int taskNumber = input.nextInt();
        input.nextLine();

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            System.out.println("What should the task be now:");
            String newDescription = input.nextLine();
            tasks.set(taskNumber - 1, newDescription);
            System.out.println("LET'SSS GOOO TASK HAS BEEN CHANGED\n");
            //inspired by Dom XD ^
        } else {
            System.out.println("ERM... That task like doesn't exist.(Hint: Choose an actual task <:)\n");
        }
        options();
    }
}
//add robloc
