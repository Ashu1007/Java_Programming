package while_loop_Core_java_program;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first no: ");
		int a=sc.nextInt();
		System.out.print("Enter second no: ");
		int b=sc.nextInt();
		System.out.println(a+" to the power "+b+" is: "+getPower(a,b));
		sc.close();
	}

	public static int getPower(int a, int b) {
		int pow=1;
		int i=1;
		while(i<=b) {
			pow=pow*a;
			i++;
		}
		return pow;
	}

}
