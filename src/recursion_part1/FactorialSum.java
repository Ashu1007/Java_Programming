package recursion_part1;

import java.util.Scanner;

public class FactorialSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n=sc.nextInt();
		getSumFactorial(n,1);
		System.out.println(fact);
		sc.close();
	}
	static int fact=1;
	public static void getSumFactorial(int n,int i) {
		if(i<=n) {
			fact=fact*i;
			getSumFactorial(n,i+1);
		}
	}

}
