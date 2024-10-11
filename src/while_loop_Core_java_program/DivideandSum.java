package while_loop_Core_java_program;

public class DivideandSum {
	public static void main(String[] args) {
		
		double i=1;
		double sum=0;
		
		while(i<=99) {
			sum=sum+(1/i);
			i++;
		}
		System.out.println("sum is: "+sum);
		
	}
}