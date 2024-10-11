package while_loop_Core_java_program;

import java.util.Scanner;

public class FactorNum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		getFactors(n);
		sc.close();
	}
	private static void getFactors(int n) {
		int i=1;    int count=0;
		System.out.println("All the factors of "+n+" are Below: ");
		while(i<=n/2) {
			if(n%i==0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		System.out.println("\nTotal Factor Are: "+count);

	}
  
}
