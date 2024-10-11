package pattern_Program_3;

import java.util.Scanner;

public class Damaru {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printDamaru(n);
		sc.close();
	}
	public static void printDamaru(int n) {
		int star=n;
		int space=0;
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<mid) {
				star-=2; space++;
			}
			else {
				star+=2; space--;
			}
			System.out.println();
		}
	}

}
