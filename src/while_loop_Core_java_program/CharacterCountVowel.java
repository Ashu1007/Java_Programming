package while_loop_Core_java_program;

import java.util.Scanner;

public class CharacterCountVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		vowelCharacterInString(s1);
		sc.close();
	}
	public static void vowelCharacterInString(String s1) {
		s1=s1.toLowerCase();
		int i=0;
		int count=0;
		while(i<s1.length()) {
			char ch=s1.charAt(i);
			 
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
				
			}
			i++;
		}
		System.out.println("total no of vowels in "+s1+ " is: "+count);
	}

}
