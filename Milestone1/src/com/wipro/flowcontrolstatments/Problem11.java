package com.wipro.flowcontrolstatments;
//Write a program to print all even number in the range of 23 to 57.
public class Problem11 
{

	public static void main(String[] args) 
	{
		for(int i=23;i<=57;i++)
		{
			if((i&1)==0)
			{
				System.out.println(i);
			}
		}
	}

}