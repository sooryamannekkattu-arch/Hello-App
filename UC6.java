public class HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove last ", "
            names.setLength(names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}
