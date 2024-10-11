package recursion_part1;

import java.util.Scanner;

public class CountDigit {
	static int count =0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the no: ");
		int n=sc.nextInt();
		getCount(n);
		System.out.println("Total count is: "+count);
		sc.close();
	}
	public static void getCount(int n) {
		if(n>0) {
			count++;
			getCount(n/10);
		}
	}

}
