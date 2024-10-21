package _array_Rotate;

import java.util.Scanner;

public class LeftRotate2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {12,13,14,15,16};
		System.out.print("Elements Before Rotation: ");
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
		k=k%a.length;
		revers(a,0,a.length-1);
		revers(a,0,a.length-1-k);
		revers(a,a.length-k,a.length-1);
	}
	public static void revers(int[] a,int start,int end) {
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

}