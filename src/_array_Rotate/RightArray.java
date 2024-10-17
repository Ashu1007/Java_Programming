package _array_Rotate;

public class RightArray {
	public static void main(String[] args) {
		int[] arr= {12,13,14,15,16};
		System.out.println("Element Before Rotation: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		rightRotate(arr);
		System.out.println("\nElement After Rotation: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	public static void rightRotate(int[] arr) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}

}
