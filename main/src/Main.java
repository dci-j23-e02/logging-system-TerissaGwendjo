public class Main {

    public static void main(String[] args) {

        //Creating a variable named logger of type Logger with the singleton instance of the Logger class.
        //This instance can now be used to access the logging functionality provided by the Logger class throughout the application.
        Logger logger = Logger.getInstance();

        // Log messages with different severity levels
        logger.log("Application started...", "INFO");
        logger.log("WARNING! Low disk space.", "WARNING");
        logger.log("ERROR! Failed to save file.", "ERROR");
        logger.log("APPLICATION ENDED!" );


        // Demonstrate that the same Logger instance is used
        Logger anotherLogger = Logger.getInstance();
        System.out.println();
        System.out.println("Are the two logger instances the same? " + (logger == anotherLogger));
    }

}
