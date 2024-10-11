package recursion_part1;

public class Program1 {
	static int count=0;
    public static void test() {
    	
    	System.out.println("Test method start");
    	count++;
    	System.out.println(count);
    	test();
    }
    public static void main(String[] args) {
    	System.out.println("main method");
		test();
	}
}
