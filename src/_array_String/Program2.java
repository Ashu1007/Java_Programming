package _array_String;

public class Program2 {
	public static void main(String[] args) {
		String[] arr= {"Sohan","Rohan","Mohan","Ashu"};
		printCount(arr);
	}
	public static void printCount(String[] arr) {
		int count=0;
		for(String p:arr) {
			if(p.length()%2==0) {
				System.out.println(p+"==>Size is: "+p.length());
				count++;
			}
		}
		System.out.println("Total such Element are: "+count);
	}

}
