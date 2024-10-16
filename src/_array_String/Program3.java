package _array_String;

public class Program3 {
	public static void main(String[] args) {
		String[] arr= {"Mohan","Sohan","Rohan","Ashutosh"};
		 String result=biggestSize(arr);
		 System.out.println(result);
	}
	public static String biggestSize(String[] arr) {
		String big= "";
		for(String p:arr) {
			if(big.length()<p.length()) {
				big=p;
			}
		}
		return big;
	}

}
