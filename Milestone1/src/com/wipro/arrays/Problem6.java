package com.wipro.arrays;
import java.util.Arrays; 
//Write a program to sort the array.
public class Problem6 
{

	public static void main(String[] args) 
	{
		int a[]= {9,2,4,6,5,8};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
