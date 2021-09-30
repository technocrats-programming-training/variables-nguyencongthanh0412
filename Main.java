public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
			System.out.println("Hello, I am "+firstName+" "+lastName+", and I am "+age+" years old");
        // Print out whether age is even
			
        // Print out whether firstName equals lastName
			boolean doesItEqual = "firstName".equals("lastName");
			System.out.print(doesItEqual);
        // Print out whether age is greater than 0
			
    }
}
