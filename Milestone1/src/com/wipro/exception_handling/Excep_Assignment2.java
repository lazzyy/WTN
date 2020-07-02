package com.wipro.exception_handling;

public class Excep_Assignment2 
{

	public static void main(String[] args) 
	{
		int []a=new int[5];
		int sum=0,avg=0;
		for(int i=0;i<5;i++)
		{
			try
			{
				a[i]=Integer.parseInt(args[i]);
				sum+=a[i];
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
		try
		{
			avg=sum/a.length;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("The sum of the array is "+sum+" and the average is "+avg);
	}

}
