package pattern_programming;

import java.util.Scanner;

public class NumberPrint7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern7(n);
		sc.close();
	}
	public static void printPattern7(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print("("+i+","+j+")"+" ");
			System.out.println();
			System.out.println();
		}
	}

}
