package com.wipro.flowcontrolstatments;
//Write a program to print the sum of digit.
public class Problem14 
{

	public static void main(String[] args) 
	{
		int sum=0;
		int n=Integer.parseInt(args[0]);
		int c=n;
		while(n!=0)
		{
			int k=n%10;
			sum+=k;
			n=n/10;
		}
		System.out.println("The sum of dgits in " +c+ " is "+sum);
	}

}