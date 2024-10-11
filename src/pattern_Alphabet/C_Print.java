package pattern_Alphabet;

import java.util.Scanner;

public class C_Print {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
	}
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j!=1||i==n&&j!=1||j==1&&i!=1&&i!=n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
