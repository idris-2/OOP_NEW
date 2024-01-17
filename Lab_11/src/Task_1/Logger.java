package Task_1;

// Singleton Logger class
public class Logger {
    // Single instance of the Logger class
    private static Logger instance;

    // Private constructor to prevent external instantiation
    private Logger() {
    }

    // Method to get the instance of Logger, creating it if necessary
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log a general message
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    // Log an informational message
    public void logInfo(String message) {
        System.out.println("Info: " + message);
    }

    // Log a warning message
    public void logWarning(String message) {
        System.out.println("Warning: " + message);
    }

    // Log an error message
    public void logError(String message) {
        System.out.println("Error: " + message);
    }
}
