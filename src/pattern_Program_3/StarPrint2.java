package pattern_Program_3;

import java.util.Scanner;

public class StarPrint2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printStar(n);
		sc.close();
	}
	public static void printStar(int n) {
		int star=2*n-1;
		int space=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			star-=2;
			space++;
			System.out.println();
			
		}
	}

}
