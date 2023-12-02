package main.java.com.example.data_structures;

import main.java.com.example.Task.TaskItem;
import main.java.com.example.Task.Status;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks;
    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED),
                new TaskItem(4,"Prepare for the midterm", Status.IN_PROGRESS),
                new TaskItem(5,"Go biking", Status.CANCELLED)
        );
    }

    // Create a method to get all objects
    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }

    // Create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
    public List<TaskItem> getByStatus(Status status) {
        return tasks.
             stream().
             filter(s -> s.getStatus().equals(status)).
             collect(Collectors.toList());
    }

    // Create a method to find tasks whose id parameter greater than or equal to 2
    public List<TaskItem> taskIdGreaterOrEqualThanTwo() {
        return tasks.
                stream().
                filter(t -> t.getTaskId() >= 2).
                collect(Collectors.toList());
    }

    // Create a method that will, by using the forEach stream method, print to the console the description of each task
    public void printTaskDescription() {
        tasks.stream().
                forEach(taskItem -> {
                    System.out.println(" - " + taskItem.getTaskDescription());
                });
    }
}
