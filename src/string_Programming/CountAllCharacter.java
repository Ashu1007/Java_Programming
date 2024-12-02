package string_Programming;

import java.util.Scanner;

public class CountAllCharacter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		countCharacter(s);
		sc.close();
	}
	public static void countCharacter(String s) {
		int countuper=0;
		int countlower=0;
		int num=0;
		int character=0;
		int space =0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
				space++;
			}
			else if(c>=65 && c<=90) {
				countuper++;
			}
			else if(c>=97 && c<=122) {
				countlower++;
			}
			else if(c>='0' && c<='9') {
				num++;
			}
			else {
				character++;
			}
		}
		System.out.println("Count of the Special Character is: "+character);
		System.out.println("Count of the Number is: "+num);
		System.out.println("Count of the UpperCase is: "+countuper);
		System.out.println("Count of the LowerCase is: "+countlower);
		System.out.println("Count of the Space is: "+space);
	}

}
