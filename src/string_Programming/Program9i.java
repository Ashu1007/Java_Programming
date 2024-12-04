package string_Programming;

import java.util.Scanner;

public class Program9i {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		replaceSpaceWithoutReplace(s);
		sc.close();
	}
	public static void replaceSpaceWithoutReplace(String s) {
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') {
				a[i]='_';
			}
		}
		String res=new String(a);
		System.out.println(res);
	}
}
