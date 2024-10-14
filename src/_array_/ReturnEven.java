package _array_;

public class ReturnEven {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16};
		boolean result=evenReturn(arr);
		
	}
	public static boolean evenReturn(int[] arr) {
		
		for(int p:arr) {
			if(p%2==0) {
				return true;
			}
		}
		return false;
	}

}
