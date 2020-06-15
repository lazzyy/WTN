package com.wipro.flowcontrolstatments;
//Check whether number is even or odd
public class Problem2 
{

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		if((a&1)==1)
		{
			System.out.println("The number is odd");
		}
		else
		{
			System.out.println("The number is even");
		}
		//Give input through command prompt like this
		//javac Problem2.java
		//java Problem2 12
		//or If you use Eclipse goto ->Run->Run Configurations->Arguments and give input

	}

}