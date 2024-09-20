package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution5 {

    // Method to find the first occurrence of a character in a string
    public static int findFirstOccurrence(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        // Read the character to find
        System.out.print("Enter the character to find: ");
        char c = scanner.next().charAt(0);
        
        // Find the first occurrence of the character
        int index = findFirstOccurrence(str, c);
        
        // Print the result
        if (index != -1) {
            System.out.printf("First occurrence of '%c' is at index %d%n", c, index);
        } else {
            System.out.printf("Character '%c' not found in the string%n", c);
        }
        
       
    }
}
