package com.wipro.flowcontrolstatments;
//Initialize a character variable in a program and print whether it is a alphabet or digit or special character.
public class Problem5 
{

	public static void main(String[] args) 
	{
		char c=args[0].charAt(0);
		if((c>='a' &&c<='z')||(c>='A' &&c<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(c>='0'&&c<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		//Give input through command prompt like this
		//javac Problem5.java
		//java Problem5 (any input)
		//or If you use Eclipse goto ->Run->Run Configurations->Arguments and give input
	}

}
