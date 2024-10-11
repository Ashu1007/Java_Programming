package while_loop_Core_java_program;

public class SquareOfSum {
	public static void main(String[] args) {
		double n=1;
		double p=2;
		double sum=0;
		
		while(n<=100) {
			sum=sum+Math.pow(n,p);
			n++;
		}
		System.out.println("The sum of Square is "+ sum);
	}

}
