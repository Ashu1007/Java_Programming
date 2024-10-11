package while_loop_Core_java_program;

public class CubeOfSum {
	public static void main(String[] args) {
		double n=1;
		double p=3;
		double sum=0;
		
		while(n<=100) {
			sum =sum+ Math.pow(n, p);
			n++;
		}
		System.out.println("sum of cube is " + sum);
	}

}
