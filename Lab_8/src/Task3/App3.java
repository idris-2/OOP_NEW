package Task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
/*
Implement a Java program, Events, that generates a file containing simulated events and provides functionality to read the events from 
the file in multiple iterations. 
Implement a method named generateEventsFile that takes a filename and the number of records as parameters. The number of records to be 
generated is final and has a value of one million. The method should create a file containing events with the following information for 
each record:

Timestamp: A random timestamp 
Event Type: Randomly selected from a predefined array of event types ({"Login", "Logout", "Purchase", "ViewPage", "Error"}).
User ID: A random integer between 0 and 999.

The generated file should have one event per line. 
Additionally, implement a method named readEventsFile that takes a filename as a parameter. The method should read events from the file 
and print each event to the console. It should read the file in 5 iterations. 

In the main method, specify the filename (e.g., "events.txt"), call the generateEventsFile method to generate the events file, and call 
the readEventsFile method to read and print events from the file in multiple iterations.
*/

public class App3 {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUMBER_OF_RECORDS = 1000000;

    public static void main(String[] args) {
        String filename = "events.txt";

        // Generate events file
        generateEventsFile(filename, NUMBER_OF_RECORDS);

        // Read and print events from the file in 5 iterations
        readEventsFile(filename, 5);
    }

    public static void generateEventsFile(String filename, int numberOfRecords) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Random random = new Random();

            for (int i = 0; i < numberOfRecords; i++) {
                long timestamp = System.currentTimeMillis();
                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
                int userId = random.nextInt(1000);

                String event = timestamp + "," + eventType + "," + userId;
                writer.write(event);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readEventsFile(String filename, int iterations) {
        try {
            for (int i = 1; i <= iterations; i++) {
                System.out.println("Iteration " + i + ":");
                Files.lines(Path.of(filename))
                        .forEach(System.out::println);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}