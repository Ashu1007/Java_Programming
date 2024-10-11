package recursion_part1;

import java.util.Scanner;

public class ReversNumber {
	static int rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number: ");
		int n=sc.nextInt();
		getRevers(n);
		System.out.println(rev);
		sc.close();
	}
	public static void getRevers(int n) {
		if(n>0) {
			rev=rev*10+n%10;
			getRevers(n/10);
		}
	}

}
