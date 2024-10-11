package while_loop_Core_java_program;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n=sc.nextInt();
		generateFibbonacci(n);
		sc.close();
	}
	public static void generateFibbonacci(int n) {
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2+" ");
		int i=1;
		while(i<=n-2) {
			int n3=n1+n2; 
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
			i++;
		}
	}

}
