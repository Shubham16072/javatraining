package Lonewolf;

import java.util.Scanner;

public class Lone 
{
	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number of elements in the array");
		n=sc.nextInt();
		Integer arr[ ]=new Integer[n];
		System.out.println("Enter the element in the array");
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();// TODO Auto-generated method stub
		}
		int temp=0;
		for(i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				System.out.println();
				System.out.println("");
			}
		}
		for(i=0;i<arr.length;i++)
		{
					System.out.println(arr[i]+"");
		}
	}
		
}
