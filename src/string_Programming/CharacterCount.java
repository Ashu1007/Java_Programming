package string_Programming;

import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		characterCount(s);
		sc.close();
		
	}
	public static void characterCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>=65 && c<=97 || c>=97 && c<=122 || c>='0' && c<='9') {
				count++;
			}
		}
		System.out.println("Character count is: "+count);
		
	}

	
}
