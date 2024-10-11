package while_loop_Core_java_program;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n=sc.nextInt();
		if(isPrimeNum(n))
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" Not a prime Number");
		
		//close Scanner
		sc.close();	
		
	}
	public static boolean isPrimeNum(int n) {
		if(n<2)
			return false;
		int i=2;
		while(i*i<=n) {
			if(n%i==0) {
			return false;
		}
		i++;
	}
	
	return true;

	}
	}
