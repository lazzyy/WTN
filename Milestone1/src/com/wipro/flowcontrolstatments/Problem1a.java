package com.wipro.flowcontrolstatments;
//Check whether a number is positive ,negative or zero through command prompt
public class Problem1a 
{

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if (a==0)
		{
			System.out.println("The number is 0");
		}
		else
		{
			System.out.println("The number is negative");
		}
		//Give input through command prompt like this
		//javac Problem1a.java
		//java Problem1a 10
		//or If you use Eclipse goto ->Run->Run Configurations->Arguments and give input
	}

}