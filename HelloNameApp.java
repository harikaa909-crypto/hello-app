// UC2 - Hello App with Command Line Argument
// Program Name: HelloNameApp
// Description: Displays "Hello <name>" using command-line argument

public class HelloNameApp {

    public static void main(String[] args) {

        // Check if argument is provided
        if (args.length > 0) {
            String userName = args[0];
            System.out.println("Hello " + userName);
        } else {
            System.out.println("Hello User");
        }
    }
}