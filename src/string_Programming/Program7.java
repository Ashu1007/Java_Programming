package string_Programming;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		spaceIndexPrint(s);
		sc.close();
	}
	public static void spaceIndexPrint(String s) {
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
				System.out.println("Index Where Space is: "+i);
			}
		}
	}

}
