package pattern_Alphabet;

import java.util.Scanner;

public class V_Print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
		
	}
	public static void printPattern(int n) {
		int sst=1;
		int est=2*n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=est;j++) {
				if(j==sst||j==est)
					System.out.print("* ");
				else 
					System.out.print(" ");
				
			}
				sst++;
				est--;
				System.out.println();
			
		}
	}

}
