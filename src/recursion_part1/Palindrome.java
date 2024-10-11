package recursion_part1;

import java.util.Scanner;

public class Palindrome {
	static int rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the no: ");
		int n=sc.nextInt();
		checkPalindrome(n);
		if(n==rev) {
			System.out.println(n+" is Palindrome");
		}
		else {
			System.out.println(n+" is Not Palindrome");
		}
		sc.close();
	}
	public static void checkPalindrome(int n) {
		if(n>0) {
			rev=rev*10+n%10;
			checkPalindrome(n/10);
		}
	}

}
