package recursion_part1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main starts");
		System.out.println("Enter the no: ");
		int n=sc.nextInt();
		getSquareSum(n);
		System.out.println("Main Method ends");
		sc.close();
	}
	public static void getSquareSum(int n) {
		if(n<=100) {
			System.out.println(n+"*"+n+" is: "+n*n);
			getSquareSum(n+1);
		}
		else {
			System.out.println("End getSquareSum Method");
		}
	}

}
