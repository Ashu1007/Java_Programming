package _array_Rotate;

import java.util.Scanner;

public class RightRotate1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {12,13,14,15,16};
		System.out.println("Element Before Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println("\nEnter the Rotation: ");
		int n=sc.nextInt();
		rotateArray(a,n);
		System.out.println("\nElement After Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}	
		sc.close();
	}
	public static void rotateArray(int[] a,int k) {
		for(int j=1;j<=k;j++) {
			int temp=a[a.length-1];
			for(int i=a.length-2;i>=0;i--) {
				a[i+1]=a[i];
			}
			a[0]=temp;
		}
	}

}
