package _array_;

public class EvenIndex {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16,17};
		printEvenEndex(arr);
	}
	public static void printEvenEndex(int[] arr) {
		System.out.println("All the even index are: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
