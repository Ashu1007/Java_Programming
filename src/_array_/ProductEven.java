package _array_;

public class ProductEven {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16};
		boolean result=checkEven(arr);
		if(result) {
			System.out.println("Product is Even");
		}
		else {
			System.out.println("Product is Odd");
		}
	}
	public static boolean checkEven(int[] arr) {
		
		for(int p:arr) {
			if(p%2==0) 
				return true;
		}
		return false;
	}

}
