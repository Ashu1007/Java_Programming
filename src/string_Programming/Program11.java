package string_Programming;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		evenNumericChar(s);
		sc.close();
	}
	public static void evenNumericChar(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				if((c-'0')%2==0)
					sum=sum+c-'0';
				
				
			}
		}
		System.out.println("Sum of all Even Numeric Character is: "+sum);
	}

}
