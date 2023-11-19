package main.java.com.example;

import main.java.com.example.data_structures.DataStructures;
import main.java.com.example.Task.Status;
import main.java.com.example.Task.TaskItem;
import main.java.com.example.colors.ConsoleColors;
import main.java.com.example.db_connect.DbConnect;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws SQLException {
        System.out.println();
        Scanner reader = new Scanner(System.in);

        DataStructures dt = new DataStructures();

        List<TaskItem> taskItems = dt.getAllObjects();

        System.out.println(ConsoleColors.CYAN + "Printing all Objects..." + ConsoleColors.RESET);

        int i = 1;
        for(TaskItem ti : taskItems) {
            System.out.print(ConsoleColors.YELLOW + "Object" + i + ": " + ConsoleColors.RESET + ti + ", ");
            System.out.println(ConsoleColors.BLUE + "ID: " + ConsoleColors.RESET + ti.getTaskId() + ConsoleColors.PURPLE + ", Task Description: " + ConsoleColors.RESET + ti.getTaskDescription() + ConsoleColors.GREEN +", Task Status: " + ConsoleColors.RESET + ti.getStatus());
            i++;
        }

        System.out.println();

        Status status = Status.values()[new Random().nextInt(Status.values().length)]; // gets a random value from Status
        System.out.println(ConsoleColors.CYAN + "Printing all Task Statuses with status: " + ConsoleColors.GREEN + status + ConsoleColors.RESET);

        List<TaskItem> filteredTasks = dt.getByStatus(status);
        for(TaskItem ti : filteredTasks) {
            System.out.println(ConsoleColors.GREEN + "Task Status: " + ConsoleColors.RESET + ti.getStatus() + ", " + ConsoleColors.PURPLE +  "Task Description: " + ConsoleColors.RESET + ti.getTaskDescription() + ConsoleColors.RESET);
        }

        System.out.println();

        System.out.println(ConsoleColors.CYAN + "Printing all Tasks with " + ConsoleColors.BLUE + "ID" + ConsoleColors.RESET + ConsoleColors.RED + " >= 2" + ConsoleColors.RESET);
        List<TaskItem> greaterOrEqualTwo = dt.taskIdGreaterOrEqualThanTwo();
        for(TaskItem ti : greaterOrEqualTwo) {
            System.out.println(ConsoleColors.BLUE + "ID: " + ConsoleColors.RESET + ti.getTaskId() + ConsoleColors.PURPLE + ", Task Description: " + ConsoleColors.RESET + ti.getTaskDescription());
        }

        System.out.println();

        System.out.println(ConsoleColors.CYAN + "Printing " + ConsoleColors.PURPLE + "Task Descriptions..." + ConsoleColors.RESET);
        dt.printTaskDescription();

        System.out.println();

        System.out.print(ConsoleColors.CYAN + "Do you wish to connect to the Database?(y / n)?: " + ConsoleColors.RESET);
        String answer = reader.nextLine();

        System.out.println();

        if(answer.equals("y")) {
            DbConnect db = new DbConnect();
            System.out.println();
            db.getAllCustomers();

            System.out.println();

            System.out.print("Enter task ID: ");
            int taskId = Integer.parseInt(reader.nextLine());

            db.getTaskById(taskId);
        } else {
            System.out.println("OK, bye!");
        }
        reader.close();
    }
}
