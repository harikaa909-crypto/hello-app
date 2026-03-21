// UC3 - Hello App with Default Name
// Program Name: HelloNameDefaultApp
// Description: Displays "Hello <name>" using command-line argument or defaults to "World"

public class HelloNameDefaultApp {

    public static void main(String[] args) {

        String userName;

        // Check if argument is provided
        if (args.length > 0) {
            userName = args[0];
        } else {
            userName = "World";
        }

        // Output
        System.out.println("Hello " + userName);
    }
}