package pattern_programming;

import java.util.Scanner;

public class NumberPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		numberPattern(n);
		sc.close();
	}
	public static void numberPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
