package pattern_programming;

import java.util.Scanner;

public class StarProgram5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern5(n);
		sc.close();
		
	}
	public static void printPattern5(int n) {
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==mid||j==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
