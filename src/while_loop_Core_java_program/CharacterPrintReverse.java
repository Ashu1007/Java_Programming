package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterPrintReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		printCharacterFromEnd(s1);
		sc.close();
	}
	public static void printCharacterFromEnd(String s1) {
		int i=s1.length()-1;
		while(i>=0) {
			System.out.println(s1.charAt(i));
			i--;
		}
	}

}
