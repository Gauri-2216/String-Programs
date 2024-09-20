package StringImportant;

import java.util.Scanner;

public class RemoveVowelApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        char[] ch = str.toCharArray();
        int i, j;
        int len = ch.length;
        
        // Variable to keep track of the current position in the array
        int newLength = 0;
        
        for (i = 0; i < len; i++) {
            if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' &&
                ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U') {
                // If the character is not a vowel, keep it
                ch[newLength++] = ch[i];
            }
        }
        
        // Create a new character array with the correct length
        char[] result = new char[newLength];
        System.arraycopy(ch, 0, result, 0, newLength);
        
        System.out.println("String after removing vowels:");
        System.out.println(new String(result));
    }
}
