package recursion_part1;

import java.util.Scanner;

public class PowerCalculate {
	static int pow=1;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the value a: ");
		int a=sc.nextInt();
		System.out.println("ENter the value b:");
		int b=sc.nextInt();
		getPower(a,b);
		System.out.println(a+" top power "+b+" is: "+pow);
		sc.close();
	}
	public static void getPower(int a,int b) {
		if(b>0) {
			pow=pow*a;
			getPower(a,b-1);
		}
	}

}
