package pattern_programming;

import java.util.Scanner;

public class StarProgram4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		int n=sc.nextInt();
		printPattern4(n);
		sc.close();
	}
	public static void printPattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==2||i==n||i==n-1||j==1||j==2||j==n||j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
