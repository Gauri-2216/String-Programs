package FullStackPDFstringSolution;
import java.util.Scanner;

public class solution7 {

    // Method to find all occurrences of a character in a string
    public static void findAllOccurrences(String str, char c) {
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.printf("Character '%c' not found in the string%n", c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Read the character to find
        System.out.print("Enter the character to find: ");
        char c = scanner.next().charAt(0);
        
        // Print the results
        System.out.printf("All occurrences of '%c' are at indices: ", c);
        findAllOccurrences(str, c);
        
        scanner.close();
    }
}
