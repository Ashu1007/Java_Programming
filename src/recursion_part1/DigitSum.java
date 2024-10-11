package recursion_part1;

import java.util.Scanner;

public class DigitSum {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the no: ");
		int n=sc.nextInt();
		getSum(n);
		System.out.println("Sum of is "+sum);
		sc.close();
	}
	public static void getSum(int n) {
		if(n>0) {
			sum=sum+n%10;
			getSum(n/10);
		}
	}

}
