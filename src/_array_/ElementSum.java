package _array_;

public class ElementSum {
	public static void main(String[] args) {
		int[]  arr= {12,13,14,15,16};
		getSumElement(arr);
	}
	public static void getSumElement(int[] arr) {
		int sum=0;
		for(int p:arr) {
				sum=sum+p;
			}
		System.out.println(sum);
	}

}
