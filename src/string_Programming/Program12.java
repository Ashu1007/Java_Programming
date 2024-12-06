package string_Programming;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		reversString(s);
		sc.close();
	}
	public static void reversString(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println("Revers of "+s+" is: "+rev);
	}

}
