package algorithms;
import java.io.*;
import java.util.*;
public class RotateOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Array Rotation One By One Method\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n Input the size of the array\n");
		Scanner scan=new Scanner(System.in);
		int temp,i=0;
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.print("\tEnter the elements in the array\n");
		for(i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		System.out.print("\n\tYou have entered the following values\n");
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\n\tEnter by how many indices you want to rotate this array\n");
		int d=scan.nextInt();
		for(;d>0;d--)
		{
			temp=arr[0];
			for(i=1;i<arr.length;i++)
				arr[i-1]=arr[i];
			arr[arr.length-1]=temp;
		}
		
		//After the rotation
		System.out.print("\n\tAfter Rotatin Array:\n");
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
