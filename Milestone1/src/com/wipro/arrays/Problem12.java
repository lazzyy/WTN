package com.wipro.arrays;
//Write a program for given 2 arrays a and b, each length 3, form a new array of length 2, containing their middle elements.
public class Problem12 
{

	public static void main(String[] args) 
	{
		int a[]=new int[6];
		for(int i=0;i<6;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(i==1||i==4)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		
	}

}
