package _array_;

public class BiggestElement {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16};
		biggestElement(arr);
	}
	public static void biggestElement(int[] arr) {
		int big=0;
		for(int p:arr) {
			if(p>big) {
				big=p;
			}
		}
		System.out.println(big);
	}

}
