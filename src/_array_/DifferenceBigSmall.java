package _array_;

public class DifferenceBigSmall {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16};
		int result=  printDifference(arr);
		System.out.println("The Difference is: "+result);
	}
	public static int printDifference(int[] arr) {
		int big=arr[0];
		int small=arr[0];
		for(int p:arr) {
			if(p>big) {
				big=p;
			}
			if(p<small) {
				small=p;
			}
		}
		return big-small;
	}

}
