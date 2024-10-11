package pattern_programming_2;

import java.util.Scanner;

public class NumberPrint5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		patternPrint(n);
		sc.close();
	}
	public static void patternPrint(int n) {
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(j+" ");
			}
			space--;
			star++;
			System.out.println();
		}
	}

}
