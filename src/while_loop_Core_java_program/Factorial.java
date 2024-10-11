package while_loop_Core_java_program;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int n=sc.nextInt();
		int fact=getfactorial(n);
		System.out.println("The factorial of "+n+"! is: "+fact);
		sc.close();
	}
	public static int getfactorial(int n) {
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		return fact;
	}

}
