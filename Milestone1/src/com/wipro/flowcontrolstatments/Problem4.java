package com.wipro.flowcontrolstatments;
//Initialize two character variables in a program and display the characters in alphabetical order.
public class Problem4 
{

	public static void main(String[] args) 
	{
		char c1=args[0].charAt(0);
		char c2=args[1].charAt(0);
		if(c1<c2)
		{
			System.out.println(c1+","+c2);
		}
		else
		{
			System.out.println(c2+","+c1);
		}
		//Give input through command prompt like this
		//javac Problem4.java
		//java Problem4 (any input)
		//or If you use Eclipse goto ->Run->Run Configurations->Arguments and give input

	}
}