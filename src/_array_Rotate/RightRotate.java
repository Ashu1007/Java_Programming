package _array_Rotate;

public class RightRotate {
	public static void main(String[] args) {
		int[] a= {12,13,14,15,16};
		System.out.println("Enter the Element: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		rotateArray(a);
		System.out.println("\nElement After Rotation");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void rotateArray(int[] a) {
		int temp=a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
	}

}