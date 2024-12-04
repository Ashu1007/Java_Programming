package string_Programming;

import java.util.Scanner;

public class Program9ii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		replaceSpaceWithMethod(s);
		sc.close();
	}
	public static void replaceSpaceWithMethod(String s) {
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
			s=s.replace(' ', '_');
			}
		}
		System.out.println("Replaced String is: "+s);
	}

}
//for(int i=0;i<s.length();i++) {
//	if(s.charAt(i)==' ')
//		s=s.replace(' ', '_');
//	
//}
//System.out.println(s);
