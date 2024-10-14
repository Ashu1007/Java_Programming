package _array_;

public class ElementSum2 {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16};
		getSumElement(arr);
		}
	
	public static void getSumElement(int[] arr) {
		int sum=0;
		for(int p:arr) {
			if(p%4==0) {
				sum=sum+p;
			}
		}
		System.out.println(sum);
	}

}
