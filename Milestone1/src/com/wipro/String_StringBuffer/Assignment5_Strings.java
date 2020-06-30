package com.wipro.String_StringBuffer;
//Write a java program that accepts a string and returns a new string without the first and last character of the input string.
public class Assignment5_Strings 
{
	public static void main(String[] args) 
	{
		String s=args[0];
		System.out.println(s.substring(1,s.length()-1));
	}

}
