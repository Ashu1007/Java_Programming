package while_loop_Core_java_program;

public class MultipleOfSquareSum2 {
	public static void main(String[] args) {
		double i=1;
		double sum=0;
		
		while(i<=99) {
			sum=sum+i*i*(i+1);
			i++;
		}
		System.out.println("sum is: "+sum);
	}

}
