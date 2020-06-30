package com.wipro.String_StringBuffer;
//Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
public class Assignment4_Strings 
{

	public static void main(String[] args) 
	{
		String s=args[0];
		if(s.length()%2==0)
		{
			System.out.println(s.substring(0,s.length()/2));
		}
		else
		{
			System.out.println("Null");
		}
	}

}
