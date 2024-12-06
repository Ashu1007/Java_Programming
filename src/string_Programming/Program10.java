package string_Programming;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s=sc.nextLine();
		sumOfNumericChar(s);
		sc.close();
	}
	public static void sumOfNumericChar(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9' ) {
				sum=sum+c-'0';
			}
		}
		System.out.println("Sum of All Numeric Character is: "+sum);
	}

}
