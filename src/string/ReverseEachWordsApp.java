package string;

import java.util.Scanner;

public class ReverseEachWordsApp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = s.nextLine();
        char[] ch = str.toCharArray();
        
        
        // Step 1: Reverse the entire string
        reverseArray(ch, 0, ch.length - 1);

        // Step 2: Reverse each word in the reversed string
        int start = 0;
        for (int i = 0; i <= ch.length; i++) {
            // Check for space or end of string
            if (i == ch.length || ch[i] == ' ') {
                reverseArray(ch, start, i - 1);
                start = i + 1;
            }
        }

        System.out.println("\nAfter reversing each word:");
        for (char c : ch) {
            System.out.print(c);
        }
    }

    // Function to reverse a part of the array from index `start` to index `end`
    private static void reverseArray(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
