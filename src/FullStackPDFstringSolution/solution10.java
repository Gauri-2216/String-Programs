package FullStackPDFstringSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Handle empty string case
        

        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the lowest frequency
        char lowestFrequencyChar = str.charAt(0);
        int lowestFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < lowestFrequency) {
                lowestFrequency = entry.getValue();
                lowestFrequencyChar = entry.getKey();
            }
        }

        // Print the result
        System.out.printf("The lowest frequency character is '%c' with frequency %d%n", lowestFrequencyChar, lowestFrequency);
        
        scanner.close();
    }
}
