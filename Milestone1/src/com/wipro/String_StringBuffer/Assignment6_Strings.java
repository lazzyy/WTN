package com.wipro.String_StringBuffer;
//Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
public class Assignment6_Strings 
{
	public static void main(String[] args) 
	{
		String a=args[0];
		String b=args[1];
		if(a.length()>b.length())
		{
			System.out.println(b+a+b);
		}
		else
		{
			System.out.println(a+b+a);
		}
	}

}
