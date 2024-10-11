package pattern_programming_2;

import java.util.Scanner;

public class NumberPrint4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
	}
	public static void printPattern(int n) {
		int star=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print(j%2+" ");
			}
			star--;
			System.out.println();
		}
	}

}
