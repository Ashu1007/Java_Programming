package while_loop_Core_java_program;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		checkPrime(n);
		sc.close();
	}
	public static void checkPrime(int n) {
		int i=1;  int count=0;
		while(i<=n/2) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count==1)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" not a prime number");
		
	} 

}
