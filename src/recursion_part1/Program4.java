package recursion_part1;
import java.util.Scanner;
public class Program4 {
    static int i=1;
    public static void getTable(int n) {
    	if(i<=10) {
    		System.out.println(n+"*"+i+"="+(n*i));
    		i=i+1;
    		getTable(n);
    	}
    	else {
    		System.out.println("Table printed successfully");
    	}
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the no: ");
    	int n=sc.nextInt();
		getTable(n);
		sc.close();
	}
}
