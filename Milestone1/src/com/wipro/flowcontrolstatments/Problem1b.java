package com.wipro.flowcontrolstatments;
//Check whether the last digits of two number is same or not
public class Problem1b 
{

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if((a%10)==(b%10))
		{
			System.out.println("Both numbers have same last digit");
		}
		else
		{
			System.out.println("The numbers have different last digits");
		}
		//Give input through command prompt like this
		//javac Problem1b.java
		//java Problem1b 12 20
		//or If you use Eclipse goto ->Run->Run Configurations->Arguments and give input

	}

}