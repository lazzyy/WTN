package com.wipro.String_StringBuffer;
//Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
public class Assignment3_Strings 
{
	public static void main(String[] args) 
	{
		String s1=args[0];
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2+=s1.substring(0,2);
		}
		System.out.println(s2);
	}

}
