package recursion_part1;

public class Program2 {
	
public static void test(int i) {
	if(i<=100) {
		System.out.println(i);
		int a=i+1;
		test(a);
	}
	
	else {
		System.out.println("Test ends");
	}
	
	
}
public static void main(String[] args) {
	System.out.println("Main starts");
	test(1);
	System.out.println("Main ends");
}
}
