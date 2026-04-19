public class HelloApp {
    public static void main(String[] args) {

        String output;

        if (args.length > 0) {
            // Join all names with comma
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        } else {
            output = "Hello, World!";
        }

        System.out.println(output);
    }
}
