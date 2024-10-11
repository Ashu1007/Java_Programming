package pattern_programming;

import java.util.Scanner;

public class StarProgram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		StarSquarePrint(n);
		sc.close();
	}
	public static void StarSquarePrint(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
	
		}
	}

}
