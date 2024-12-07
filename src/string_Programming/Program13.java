package string_Programming;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		boolean res=isPalindrome(s);
		System.out.println(res);
		sc.close();
	}
	public static boolean isPalindrome(String s) {
		int n=s.length();
		for(int i=0;i<n/2;i++) {
			if(!(s.charAt(i)==(s.charAt(n-1-i)))) {
				return false;
			}
		}
		return true;
	}

}
