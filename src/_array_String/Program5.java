package _array_String;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element "+(i+1)+": ");
			a[i]=sc.nextInt();
		}
		if(isStrictlyIncreasing(a)) {
			System.out.println("Array is Strictly Increasing");
		}
		else {
			System.out.println("Array is Not Strictly Increasing");
		}
		sc.close();
	}
	public static boolean isStrictlyIncreasing(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]<a[i]) {
				return false;
			}
		}
		return true;
	}

}
