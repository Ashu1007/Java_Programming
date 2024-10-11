package pattern_programming;

import java.util.Scanner;

public class Swastik {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printSwastik(n);
		sc.close();
	}
	public static void printSwastik(int n) {
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==mid||j==mid||i==1&&j>mid||j==n&&i>mid||i==n&&j<mid||j==1&&i<mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
