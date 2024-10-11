package pattern_programming;

import java.util.Scanner;

public class NumberPrint3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter the number:");
		int n=sc.nextInt();
		printNumber3(n);
		sc.close();
	}
	public static void printNumber3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%3d",j%2);
			}
			System.out.println();
		}
	}

}
