package pattern_Program_3;

import java.util.Scanner;

public class StarPrint6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
	}
	public static void printPattern(int n) {
		int space=n/2;
		int star=1;
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<mid) { 
				star++; space--;
		}else {
				
				star--; space++;
			}
				System.out.println();
		}
	}

}
