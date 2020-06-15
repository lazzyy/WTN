package com.wipro.arrays;
//Write a program to print all even numbers of the array first and odd numbers after that.
public class Problem10 
{

	public static void main(String[] args) 
	{
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
