package while_loop_Core_java_program;

public class Program3 {
	public static void main(String[] args) {
		int i=1000;
		int count=0;
		
		while(i<=2000) {
			if(i%10==7 && i%7==0) {
				System.out.print(i+ " ");
				count++;
			}
			i++;
		}
		System.out.println("\nThe count is " + count);
	}

}
