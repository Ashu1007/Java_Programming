package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterCountConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s1=sc.nextLine();
		consonantsCount(s1);
		sc.close();
	}
	public static void consonantsCount(String s1) {
		s1=s1.toLowerCase();
		int i=0;
		int count=0;
		while(i<s1.length()) {
			char x=s1.charAt(i);
			if(x>=97&&x<=122) {
				if(!(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')) {
					count++;
				}
			}
				i++;
			}
			System.out.println("Total no. of consonants in "+s1+" is: "+count);
		}
	

}
