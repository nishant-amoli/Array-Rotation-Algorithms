package algorithms;
import java.io.*;
import java.util.*;
public class ArrayRotationUsingTempArray {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Array Rotation Using Temporary Array\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n Input the size of the array\n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int j;
		System.out.print("\tEnter the elements in the array\n");
		for(int i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		System.out.print("\n\tYou have entered the following values\n");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\n\tEnter by how many indices you want to rotate this array\n");
		int d=scan.nextInt();
		int []temp=new int[d];
		for(int i=0;i<d;i++)
			temp[i]=arr[i];
		for(int i=d;i<arr.length;i++)
			arr[i-d]=arr[i];
		j=0;
		for(int i=arr.length-d;i<arr.length;i++)
		{
			arr[i]=temp[j];
			j++;
		}
		//After the rotation
		System.out.print("\n\tAfter Rotatin Array by "+d+" indices:\n");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
