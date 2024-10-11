package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterStringRevers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s1=sc.nextLine();
		printCharacterRevers(s1);
		sc.close();
		
	}
	public static void printCharacterRevers(String s1) {
		String rev="";
		int i=s1.length()-1;
		while(i>=0) {
			rev=rev+s1.charAt(i);
			i--;
		}
		System.out.println(rev);
	}

}
