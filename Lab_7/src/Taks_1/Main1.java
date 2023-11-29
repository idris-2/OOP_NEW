package Taks_1;

/*
Create a simple logging system that allows different components of a system to log messages. Implement this system using both 
traditional class-based and record-based approaches. Use lambda functions to define the logging behavior.

- Create an interface called Logger with a single method logMessage(String message)
- Implement a record named RecordLogger that implements the Logger interface.
- Implement the logMessage method to print the log message with the logger name.
- Implement a class named ClassLogger that also implements the Logger interface.
- The class should have a constructor that takes a String representing the logger name.
- Implement the logMessage method to print the log message with the logger name.
- In the main method, Instantiate both the RecordLogger and ClassLogger with different names.
- Use lambda functions to log messages with each logger.
*/

interface Logger {
    public void logMessage(String message);
}

record RecordLogger(String name) implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println(name + ": " + message);
    }
}

class ClassLogger implements Logger{
    private String name;
    public ClassLogger(String n){
        this.name = n;
    }
    @Override
    public void logMessage(String message){
        System.out.println(name + ": " + message);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Using RecordLogger with lambda function
        Logger recordLogger = new RecordLogger("RecordLogger");
        recordLogger.logMessage("This is a log message from RecordLogger");

        // Using ClassLogger with lambda function
        Logger classLogger = new ClassLogger("ClassLogger");
        classLogger.logMessage("This is a log message from ClassLogger");

        // Using lambda functions directly
        Logger lambdaLogger1 = message -> System.out.println("LambdaLogger1: " + message);
        Logger lambdaLogger2 = message -> System.out.println("LambdaLogger2: " + message);

        lambdaLogger1.logMessage("This is a log message from LambdaLogger1");
        lambdaLogger2.logMessage("This is a log message from LambdaLogger2");
    }
}
