package com.wipro.arrays;

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
