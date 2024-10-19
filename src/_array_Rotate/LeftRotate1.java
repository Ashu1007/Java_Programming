package _array_Rotate;

import java.util.Scanner;

public class LeftRotate1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {12,13,14,15,16};
		System.out.print("Element Before Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.print("\nEnter the Rotation: ");
		int n=sc.nextInt();
		rotateArray(a,n);
		System.out.print("\nElement After Rotation: ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		sc.close();
	}
	public static void rotateArray(int[] a,int k) {
		for(int j=1;j<=k;j++) {
			int temp=a[0];
			for(int i=1;i<a.length;i++) {
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
	}

}
