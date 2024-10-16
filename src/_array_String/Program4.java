package _array_String;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int size=sc.nextInt();
		sc.nextLine();
		String[] a=new String[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the String "+(i+1)+": ");
			a[i]=sc.nextLine();
		}
		String biggest=getBigString(a);
		System.out.println("\nBiggest String is "+biggest);
		sc.close();
	}
	public static String getBigString(String[] a) {
		String biggest="";
		for(String p:a) {
			if(p.length()>biggest.length()) {
				biggest=p;
			}
		}
		return biggest;
	}

}
