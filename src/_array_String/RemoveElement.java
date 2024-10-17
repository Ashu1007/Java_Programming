package _array_String;

import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++){
			System.out.print("Enter the Element "+(i+1)+": ");
			a[i]=sc.nextInt();
		}
		System.out.println("All the Array Elements are: ");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println("\nEnter the index to remove: ");
		int index=sc.nextInt();
		sc.close();
		try{
			if(index<0 || index>a.length)
				throw new ArrayIndexOutOfBoundsException("The Given Index is Out Of Range");
			int[] b=removeElement(a, index);
			System.out.println("New Array Elements are: ");
			for(int x:b)
				System.out.print(x+" ");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("\n====Program Ends Successfully===");
	}


	public static int[] removeElement(int[] a, int index){
		
		int[] b=new int[a.length-1];
		for(int i=0;i<b.length;i++){
			if(i<index)
				b[i]=a[i];
			else
				b[i]=a[i+1];
		}
	return b;
	}
}
