### Assignment: Implementing a Naïve Singleton for a Logging System

#### Background
In software development, logging is a critical component for tracking the behavior of applications, diagnosing problems, and understanding user actions. A logging system should ideally centralize logging management to ensure consistency across the application. For this assignment, you will develop a simple logging system using the Naïve Singleton design pattern. This system will ensure that there is only one instance of the logger, which will handle all logging requests throughout the application.

#### Objectives
1. Implement a Naïve Singleton class for the logging system.
2. The logging system should be able to handle log messages with different severity levels (e.g., INFO, ERROR).
3. Demonstrate the use of the Singleton instance by logging messages with varying severity levels.

#### Requirements
1. **Logger Singleton Class**: This class should be a Naïve Singleton that manages logging throughout the application. It should have methods to log messages with different severity levels.

2. **Logging Method**: Implement methods within the Logger class that allow logging messages. These methods should accept a message and optionally a severity level.

3. **Demonstration**: Write a main class to demonstrate the use of the Logger. Log messages with different severity levels to show that the same Logger instance is used across all logging requests.

#### Assignment Tasks

1. **Implement the Logger Class**: Create the Logger class with a private static instance variable, a private constructor, and a public static method to return the instance. Add methods to log messages with different severity levels.

2. **Implement Logging Methods**: These methods should print the log messages to the console, prefixed with the severity level and the current timestamp.

3. **Demonstrate Singleton Usage**: In your main class, obtain the Logger instance and log messages with different severity levels. Show that the same instance is being used for all logging requests.

#### Example Code Structure

```java
import java.time.LocalDateTime;

public final class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        log("INFO", message); // Default to INFO level
    }

    public void log(String level, String message) {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("[%s] %s: %s%n", now, level, message);
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started.");
        logger.log("WARNING", "Low disk space.");
        logger.log("ERROR", "Failed to save file.");
        logger.log("Application ended.");
    }
}
```

#### Deliverables
1. **Logger.java**: The Singleton class file for the logging system.
2. **Main.java**: The demonstration class file showing the Singleton in action.

This assignment will help you understand how to implement and use the Singleton design pattern to manage a shared resource (in this case, a logging system) in a software application.
