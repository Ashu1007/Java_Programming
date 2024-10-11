package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterStringRevers2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s1=sc.nextLine();
		printCharacterRevers2(s1);
		sc.close();
	}
	public static void printCharacterRevers2(String s1) {
		String rev=" ";
		int i=0;
		while(i<s1.length()) {
			rev=s1.charAt(i)+rev;
			i++;
		}
		System.out.println(rev);
	}

}
