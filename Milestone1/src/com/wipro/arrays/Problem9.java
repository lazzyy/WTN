package com.wipro.arrays;
//Write a program to replace 10's with 0's and print the 0's in last of the array.
public class Problem9 
{

	public static void main(String[] args) 
	{
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=10)
			{
				System.out.print(a[i]+" ");
				c++;
			}
		}
		for(int i=c;i<a.length;i++)
		{
				System.out.print(0 +" ");
		}
		
	}

}
