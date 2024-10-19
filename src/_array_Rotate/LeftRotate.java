package _array_Rotate;

public class LeftRotate {
	public static void main(String[] args) {
		int[] a= {12,13,14,15,16};
		System.out.print("Element Before Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		rotateArray(a);
		System.out.print("\nElement After Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void rotateArray(int[] a) {
		int temp=a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}

}
