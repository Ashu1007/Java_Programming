package string_Programming;

import java.util.Scanner;

public class ReversString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the String: ");
		String s=sc.nextLine();
		String rev=reversString(s);
		System.out.println("Revers of "+s+" is "+rev);
		sc.close();
		
	}
	public static String reversString(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		return rev;
	}

}
