package while_loop_Core_java_program;

public class Program4 {
	public static void main(String[] args) {
		int i=1;
		
		while(i<=1000) {
			if(i%10==8 && i%8==0) {
				System.out.print(i+ " ");
			}
			i++;
		}
	}

}
