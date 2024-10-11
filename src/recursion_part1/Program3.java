package recursion_part1;

public class Program3 {
	static int sum=0;
    public static void getSum(int n) {
    	if(n<=100) {
    		sum=sum+n;
    		getSum(n+1);
    	}
    	else
    		 System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
		System.out.println("Main methods start");
		getSum(1);
		System.out.println("main ends");
	}
}
