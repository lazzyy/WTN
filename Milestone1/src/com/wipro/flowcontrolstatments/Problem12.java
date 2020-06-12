package com.wipro.flowcontrolstatments;
//Write a program to check whether given number is prime or not.
public class Problem12 
{

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		if(a<=1)
		{
			System.out.println( a + " is not a prime");
		}
		else
		{
			int count=0;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(a+ " is not a prime");
			}
			else
			{
				System.out.println(a + " is Prime number");
			}
		}
	}
}
