package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterPalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        sc.close(); // Close the scanner

        if (isPalindrome(s1)) {
            System.out.println(s1 + " is a palindrome.");
        } else {
            System.out.println(s1 + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String s1) {
        int mid = s1.length() / 2;
        int i = 0;
        while (i < mid) {
            if (!(s1.charAt(i) == s1.charAt(s1.length() - 1 - i))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
