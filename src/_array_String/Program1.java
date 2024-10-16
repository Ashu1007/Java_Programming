package _array_String;

public class Program1 {
	public static void main(String[] args) {
		String[] arr= {"Mohan","Sohan","Rohan"};
		printStringLength(arr);
	}
	public static void printStringLength(String[] arr) {
		for(String p:arr) {
			System.out.println(p+"\t ==>Size is: "+p.length());
		}
	}

}
