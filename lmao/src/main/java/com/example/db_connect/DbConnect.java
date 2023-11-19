package main.java.com.example.db_connect;

import java.sql.*;
import main.java.com.example.colors.ConsoleColors;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static String PASSWORD = "jebotekonobar";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println(ConsoleColors.CYAN + "Connected to " + ConsoleColors.GREEN + "Database" + ConsoleColors.RESET);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllCustomers() throws SQLException {
        System.out.println(ConsoleColors.CYAN + "Printing all " + ConsoleColors.GREEN + "Tasks..." + ConsoleColors.RESET);
        PreparedStatement statement = this.
                connection.
                prepareStatement("SELECT task_description, task_status FROM tasks");
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(" - " + ConsoleColors.PURPLE + rs.getString("task_description") + " - " + ConsoleColors.GREEN + rs.getString("task_status") + ConsoleColors.RESET);
        }
    }

    public void getTaskById(int taskId) throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks WHERE id = ?");
        statement.setInt(1, taskId);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(ConsoleColors.BLUE + rs.getString("id") + " - " + ConsoleColors.RESET);
            System.out.print(ConsoleColors.PURPLE + rs.getString("task_description") + " - " + ConsoleColors.RESET);
            System.out.print(ConsoleColors.GREEN + rs.getString("task_status") + ConsoleColors.RESET);
        }
    }
}
