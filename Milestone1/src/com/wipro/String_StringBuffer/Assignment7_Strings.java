package com.wipro.String_StringBuffer;
//Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
public class Assignment7_Strings 
{

	public static void main(String[] args) 
	{
		String s=args[0];
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
		{
			System.out.println(s.substring(1,s.length()-1));
		}
		else if(s.charAt(0)=='x'&& s.charAt(s.length()-1)!='x')
		{
			System.out.println(s.substring(1));
		}
		else if(s.charAt(0)!='x'&& s.charAt(s.length()-1)=='x')
		{
			System.out.println(s.substring(0,s.length()-1));
		}
		else
		{
			System.out.println(s);
		}
	}

}
