package while_loop_Core_java_program;

import java.util.Scanner;

public class Program5 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n) {
			if(n%i==0) {
				System.out.print(i+ " ");
				count++;
			}
			i++;
			
		}
		System.out.println("\nthe count is " +count);
		sc.close();
	}

}
