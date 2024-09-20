package StringFinal;

import java.util.Scanner;

public class RemoveExtraSpaceApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String str = s.nextLine();
        
        // Convert the string to a character array
        char[] ch = str.toCharArray();
        int n = ch.length;

        // Index to keep track of the position in the result array
        int writeIndex = 0;

        // Flag to check if we are in a sequence of spaces
        boolean inSpace = false;

        for (int i = 0; i < n; i++) {
            if (ch[i] == ' ') {
                if (!inSpace) {
                    // Write a single space and mark that we're in a sequence of spaces
                    ch[writeIndex++] = ' ';
                    inSpace = true;
                }
            } else {
                // Write the non-space character
                ch[writeIndex++] = ch[i];
                inSpace = false; // We're not in a space sequence anymore
            }
        }

        // Create the result string with the correct length
        String result = new String(ch, 0, writeIndex);

        System.out.println("String with extra spaces removed: " + result);
    }
}
