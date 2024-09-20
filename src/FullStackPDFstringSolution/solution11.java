package FullStackPDFstringSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution11 {
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
            // Update the frequency count for each character
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print the frequency of each character
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.printf("Character '%c' occurs %d times%n", entry.getKey(), entry.getValue());
        }
        
        scanner.close();
    }
}
