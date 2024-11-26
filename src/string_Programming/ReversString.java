package string_Programming;

import java.util.Scanner;

public class ReversString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the input: ");
		String s=sc.nextLine();
		String res=reversString(s);
		System.out.println("The reverse of "+s+" is "+res);
		sc.close();
	}
	public static String reversString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			rev=rev+c;
		}
		return rev;
	}

}
