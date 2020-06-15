package com.wipro.arrays;
//Write a program to initialize an integer array and find the maximum and minimum value of the array.
public class Problem2 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int max=-999,min=999;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The max in the array is :"+max);
		System.out.println("The min in the array is :"+min);
	}

}
