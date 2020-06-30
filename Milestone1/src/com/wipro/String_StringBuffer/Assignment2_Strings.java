package com.wipro.String_StringBuffer;
//Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
public class Assignment2_Strings
{
	public static void main(String[] args) 
	{
		String s1=args[0];
		String s2=args[1];
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.charAt(s1.length()-1)==s2.charAt(0))
		{
			s1=s1.substring(0,s1.length()-1);
		}
		else
		{
			s1=s1+" ";
		}
		s1=s1+s2;
		System.out.println(s1);
	}

}
