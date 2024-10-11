package pattern_programming;

import java.util.Scanner;

public class StarProgram7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern7(n);
		sc.close();
	}
	public static void printPattern7(int n) {
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||i==mid||j==mid||i+j==n+1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
