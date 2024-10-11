package while_loop_Core_java_program;

public class MultipleOfSquareSum {
	public static void main(String[] args) {
		
		double i=1;
		double sum=0;
		
		while(i<=99) {
			sum =sum+ i*(i+1)*(i+1);
			i++;
		}
		System.out.println("This is the Multiple of square digit " +sum);
	}

}
