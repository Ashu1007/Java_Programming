package pattern_programming;

import java.util.Scanner;

public class StarProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		starprint(n);
		sc.close();
	}
	public static void starprint(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("*");
		}
	}

}
