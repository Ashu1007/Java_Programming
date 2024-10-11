package pattern_programming;

import java.util.Scanner;

public class NumberPrint5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		printPattern5(n);
		sc.close();
	}
	public static void printPattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print((i-1)%2+" ");
			System.out.println();
		}
		
	}

}
