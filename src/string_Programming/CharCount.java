package string_Programming;

import java.util.Scanner;

public class CharCount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		countWithoutSpace(s);
		sc.close();
	}
	public static void countWithoutSpace(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!(c==' ')) {
				count++;
			}
		}
		System.out.println("Character count is: "+count);
	}
	
	

}
