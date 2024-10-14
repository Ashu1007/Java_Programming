package _array_;

public class ReturnEven {
	public static void main(String[] args) {
		int[] arr= {12,10,14,16,16};
		boolean result=evenReturn(arr);
		if(result) {
			System.out.println("It Contain even no. only");
		}
		else {
			System.out.println("It Contain odd no.");
		}
		
	}
	public static boolean evenReturn(int[] arr) {
		
		for(int p:arr) {
			if(p%2==1) {
				return false;
			}
		}
		return true;
	}

}
