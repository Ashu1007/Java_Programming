package string_Programming;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		boolean res=isPalindrome(s);
		System.out.println(res);
		sc.close();
	}
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int len=s.length();
		for(int i=0;i<len/2;i++) {
			char c=s.charAt(i);
			if(c!=s.charAt(len-1-i))
				return false;
		}
		return true;
	}

}
