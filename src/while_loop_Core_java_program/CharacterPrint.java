package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		printCharecterFromStart(s1);
		sc.close();
	}
	public static void printCharecterFromStart(String s1) {
		int i=0;
		while(i<s1.length()) {
			System.out.println(s1.charAt(i));
			i++;
		}
	}

}
