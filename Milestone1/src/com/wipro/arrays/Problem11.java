package com.wipro.arrays;
//write a program to check if all the elements of the array are either 1 or 4.print "True" if it is having elements of only 1 or 4.
//else print False.
public class Problem11 
{

	public static void main(String[] args) 
	{
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1||a[i]==4)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count==a.length)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
