package main.java.com.example.Task;

/*
In this task, your goal is to create a Java program that exemplifies object-oriented programming principles by implementing 
a Task Management System. Your task is to design a class named TaskItem which should have three attributes: taskId 
(an integer representing a unique identifier for each task), taskDescription (a string describing the task), and taskStatus 
(an enum representing the status of the task with values such as TO_DO, IN_PROGRESS, COMPLETED, and CANCELLED). 
 */

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    public TaskItem(int id, String desc, Status stat){
        this.taskId =id;
        this.taskDescription = desc;
        this.taskStatus = stat;
    }

    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Status getStatus() {
        return taskStatus;
    }
    public void setStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }
    
}
