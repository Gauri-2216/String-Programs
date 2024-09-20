package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Read the character to remove
        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);
        
        // Convert the string to a char array for manipulation
        char[] charArray = str.toCharArray();
        
        int j = 0;
        
        // Traverse the character array and copy non-matching characters
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ch) {
                charArray[j++] = charArray[i];
            }
        }
        
        // Null-terminate the modified array by setting the character after the last valid one to '\0'
        if (j < charArray.length) {
            charArray[j] = '\0';
        }
        
        // Convert the char array back to a string
        // Note: Java doesn't have a null terminator for strings, so we manually build the result.
        String resultString = "";
        for (int i = 0; i < j; i++) {
            resultString += charArray[i];
        }
        
        // Print the result
        System.out.printf("String after removing all occurrences of '%c': %s%n", ch, resultString);
        
        scanner.close();
    }
}
