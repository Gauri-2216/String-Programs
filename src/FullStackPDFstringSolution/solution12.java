package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Read the character to remove
        System.out.print("Enter the character to remove: ");
        char c = scanner.next().charAt(0);
        
        // Convert the string to a char array to manipulate it
        char[] charArray = str.toCharArray();
        
        // Find the index of the first occurrence of the character
        int indexToRemove = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                indexToRemove = i;
                break;
            }
        }

        // If the character was found, remove it
        if (indexToRemove != -1) {
            // Shift characters to the left
            for (int i = indexToRemove; i < charArray.length - 1; i++) {
                charArray[i] = charArray[i + 1];
            }
            // Set the last character to null character to avoid extra character at end
            charArray[charArray.length - 1] = '\0';
        }

        // Convert the char array back to a string
        String resultString = new String(charArray).replace("\0", "");
        
        // Print the result
        System.out.printf("String after removing the first occurrence of '%c': %s%n", c, resultString);
        
        scanner.close();
    }
}
