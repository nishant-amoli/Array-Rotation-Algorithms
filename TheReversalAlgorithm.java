package algorithms;
import java.io.*;
import java.util.*;
public class TheReversalAlgorithm {
	public static void Rotate(int[]arr,int d)
	{
		Reverse(arr,0,d-1);
		Reverse(arr,d,arr.length-1);
		Reverse(arr,0,arr.length-1);
	}
	public static void Reverse(int[]arr,int start,int end)
	{
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start+=1;
			end-=1;
		}
	}
	public static void Print(int[]arr)
	{
		System.out.print("\n\tArray after Rotation:\n");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Array Rotation by the Reversal Algorithm\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n Input the size of the array\n");
		Scanner scan=new Scanner(System.in);
		int i=0;
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
		
		Rotate(arr,d);
		Print(arr);


	}

}
