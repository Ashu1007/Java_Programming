package pattern_programming_2;

import java.util.Scanner;

public class NumberPrint {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
	}
	public static void printPattern(int n) {
		int num=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
			}
			num--;
			System.out.println();
		}
	}

}
