package string_Programming;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		countVowel(s);
		sc.close();
		
	}
	public static void countVowel(String s) {
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
			}
		}
		System.out.println("Count of the Vowel is: "+count);
	}

}
