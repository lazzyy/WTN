package com.wipro.arrays;
//Write a program to find the biggest number in a 3*3 array.
public class Problem14 
{

	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int k=0,max=-9999;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[k++]);
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("The given array is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is: "+max);
	}

}
