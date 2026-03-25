public class HelloApp2 {

    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present
        StringBuilder nameBuilder = new StringBuilder();

        // Append all names with delimiter
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String names = nameBuilder.toString();
        if (names.length() > 0) {
            names = names.substring(0, names.length() - 2);
        }

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}