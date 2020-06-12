package com.wipro.flowcontrolstatments;
//Write a program to accept gender ("Male" or "Female") and age from command line arguments and 
//print the percentage of interest based on the given conditions
public class Problem6 
{

	public static void main(String[] args) 
	{
		
		 	if(args[0].charAt(0)=='F')
		 	{
		 		int a=Integer.parseInt(args[1]);
		 		if(a>=1&&a<=58)
		 		{
		 			System.out.println("8.2%");
		 		}
		 		else
		 		{
		 			System.out.println("9.2%");
		 		}
		 	}
		 	else
		 	{
		 		int a=Integer.parseInt(args[1]);
		 		if(a>=1&&a<=58)
		 		{
		 			System.out.println("8.4%");
		 		}
		 		else
		 		{
		 			System.out.println("10.5%");
		 		}
		 	}
		 	
	}

}