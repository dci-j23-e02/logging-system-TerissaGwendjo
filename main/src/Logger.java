import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance; // A static variable to hold the single instance of the Logger class

    // A private constructor to prevent instantiation from outside the class
    private Logger() {}

    // Method to get the instance of the Logger class
    public static Logger getInstance() {
        // If the instance is null, a new instance is created
        if (instance == null) {
            instance = new Logger();
        }
        // Return the instance
        return instance;
    }

    // Method to log messages with different severity levels
    // The log method takes a message and a severity level as input, gets the current date and time, formats it,
    // and then prints the log message with the severity level and timestamp.
    public void log(String message, String severity) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Define a format for the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Format the current date and time using the formatter
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the log message with the severity level and timestamp
        System.out.println("[" + formattedDateTime + "] [" + severity + "] " + message);
    }
    public void log(String message) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Define a format for the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Format the current date and time using the formatter
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println( "[" + formattedDateTime + "] "  + message);
    }

}
