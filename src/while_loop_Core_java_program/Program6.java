package while_loop_Core_java_program;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : ");
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n) {
			if(n%i==0 && count<3) {
//				System.out.println(n);
				count++;
			}
			i++;
		}
		if(count<=2) {
			System.out.println(n +" is a prime number");
		}
		else {
		System.out.println(n +" is the not a prime number");
	
		
	}
sc.close();
	}
	}
