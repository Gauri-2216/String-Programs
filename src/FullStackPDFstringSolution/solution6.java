package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution6 {

    // Method to find the last occurrence of a character in a string
    public static int findLastOccurrence(String str, char c) {
        int lastIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        // Read the character to find
        System.out.print("Enter the character to find: ");
        char c = scanner.next().charAt(0);
        
        // Find the last occurrence of the character
        int index = findLastOccurrence(str, c);
        
        // Print the result
        if (index != -1) {
            System.out.printf("Last occurrence of '%c' is at index %d%n", c, index);
        } else {
            System.out.printf("Character '%c' not found in the string%n", c);
        }
        
    }
}
