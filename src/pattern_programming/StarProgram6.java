package pattern_programming;

import java.util.Scanner;

public class StarProgram6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern6(n);
		sc.close();
	}
	public static void printPattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
