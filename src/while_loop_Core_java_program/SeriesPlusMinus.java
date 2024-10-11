package while_loop_Core_java_program;

public class SeriesPlusMinus {
	public static void main(String[] args) {
		double i=1;
		double sum=0;
		
		while(i<=100) {
			if(i%2==0) {
				sum=sum-i;
			}
			else {
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum is: "+sum);
	}

}
