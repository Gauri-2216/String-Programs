package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution8 {

    // Method to count the occurrences of a character in a string
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Read the character to count
        System.out.print("Enter the character to count: ");
        char c = scanner.next().charAt(0);
        
        // Count occurrences of the character
        int count = countOccurrences(str, c);
        
        // Print the result
        System.out.printf("Character '%c' occurs %d times in the string.%n", c, count);
        
        scanner.close();
    }
}
