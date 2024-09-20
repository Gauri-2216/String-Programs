package FullStackPDFstringSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Handle empty string case
        /*if (str == null || str.isEmpty()) {
            System.out.println("The string is empty.");
            scanner.close();
            return;
        }*/

        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the highest frequency
        char highestFrequencyChar = str.charAt(0);
        int highestFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
                highestFrequencyChar = entry.getKey();
            }
        }

        // Print the result
        System.out.printf("The highest frequency character is '%c' with frequency %d%n", highestFrequencyChar, highestFrequency);
        
        scanner.close();
    }
}
