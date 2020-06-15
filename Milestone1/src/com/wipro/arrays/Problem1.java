package com.wipro.arrays;
//Write a program to print sum and average of the array.
public class Problem1 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("The sum of the array elements: "+sum);
		System.out.println("The average of the array: "+sum/a.length);
	}

}
