package string;

import java.util.Scanner;

public class SubStringApp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the main string");
        String str = s.nextLine();
        System.out.println("Enter the sub string");
        String str2 = s.nextLine();

        int a = str.length();
        int b = str2.length();

        boolean found = false; // Flag to check if substring is found

        for (int i = 0; i <= a - b; i++) { // Loop until a-b to avoid out of bounds
            int j;
            for (j = 0; j < b; j++) {
                if (str.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == b) { // All characters matched
                System.out.println("Substring found at index  between"+i+"  and " + (i + 1));
                found = true; // Set flag to true
            }
        }

        if (!found) {
            System.out.println("Substring not found");
        }
    }
}
