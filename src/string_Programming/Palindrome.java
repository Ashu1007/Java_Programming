package string_Programming;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
	     boolean res=isPalindrome(s);
	     if(res) {
	    	 System.out.println("Yes,It is a Palindrome "+res);
	     }
	     else
	    	 System.out.println("NO, It is not Palindrome "+res);
		sc.close();
	}
	public static boolean isPalindrome(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		return rev.equalsIgnoreCase(s);
	}

}
