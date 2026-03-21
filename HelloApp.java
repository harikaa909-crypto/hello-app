// UC4 - Hello App with Multiple Command Line Arguments
// Program Name: HelloApp
// Description: Displays "Hello" with multiple names or default "World"

public class HelloApp {

    public static void main(String[] args) {

        // Example Input: java HelloApp Alice Bob Charlie
        // args = ["Alice", "Bob", "Charlie"]

        // Check if arguments are provided
        if (args.length > 0) {

            // Join all names with comma and space
            String names = String.join(", ", args);

            // Display greeting with all names
            System.out.println("Hello, " + names + "!");  
            // Output: Hello, Alice, Bob, Charlie!

        } else {

            // Executed when no arguments are given
            System.out.println("Hello, World!");  
            // Output: Hello, World!
        }

        // Example Input: java HelloApp John
        // Output: Hello, John!
    }
}