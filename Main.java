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
			System.out.println("Hello, I am " + firstName + " " + lastName + ", and I am " + age + " years old");
        // Print out whether age is even
				// if the number's remamnder is 0 that means the number is even, or else it's odd
			int ageRemander = age % 2;
			boolean ageIsEven = ageRemander == 0;
			System.out.println(ageIsEven);
			
        // Print out whether firstName equals lastName
			boolean areTheyEqual = firstName.equals(lastName);
			System.out.println(areTheyEqual);
        // Print out whether age is greater than 0
			boolean isAgeGreater = age > 0;
			System.out.println(isAgeGreater);
		
    }
}
