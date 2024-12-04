package string_Programming;

import java.util.Scanner;

public class PrintIndexNumeric { //Q:11
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		printIndexOfNumChar(s);
		sc.close();
	}
	public static void printIndexOfNumChar(String s) {
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				System.out.print(i+" ");
			}
		}
	}

}
