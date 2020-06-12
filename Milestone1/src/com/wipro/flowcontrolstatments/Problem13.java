package com.wipro.flowcontrolstatments;
//Find all the primes from 10 to 99.
public class Problem13 
{

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=10;i<=99;i++)
		{
			count=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(i + " is Prime number");
			}
		}
	}

}
