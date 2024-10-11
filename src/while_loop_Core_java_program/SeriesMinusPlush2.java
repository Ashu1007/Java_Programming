package while_loop_Core_java_program;

public class SeriesMinusPlush2 {
	public static void main(String[] args) {
		double i=1;
		double sum=0;
		
		while(i<=100) {
			if(i%2==0) {
				sum=sum-1/i;
			}
			else {
				sum=sum+1/i;
			}
			i++;
		}
		System.out.println("sum of: "+sum);
	}

}
