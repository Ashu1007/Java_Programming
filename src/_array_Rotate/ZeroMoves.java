package _array_Rotate;

public class ZeroMoves {
	public static void main(String[] args) {
		int[] a= {0,0,2,6,4,0,0};
		System.out.print("Element Before Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		shiftZero(a);
		System.out.print("\nElement After Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void shiftZero(int[] a) {
		for(int i=0,j=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[j]=a[i];
				if(i!=j) {
					a[i]=0;
				}
				j++;
			}
		}
	}
	
}
