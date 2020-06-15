package com.wipro.arrays;
//Write a program to calculate sum if the array has 6 and 7 in succeeding orders,
//ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
public class Problem8 
{

	public static void main(String[] args) 
	{
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int sum = 0,d=0;    
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==6)
		    {
				for(int j=a.length-1;j>=0;j--)
		        {
					if(a[j]==7)
		            {
		            	break;
		            }
		            d=d+a[j];
		        }
		        break;
		     }
		     sum=sum+a[i];
		  }
		 System.out.println(d+sum); 
	}
}