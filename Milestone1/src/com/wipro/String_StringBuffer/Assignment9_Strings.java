package com.wipro.String_StringBuffer;
/*Given two strings, a and b, print a new string which is made of the following combination-first character of a,
*the first character of b, second character of a, second character of b and so on. 
*Any characters left, will go to the end of the result.
*/
public class Assignment9_Strings 
{

	public static void main(String[] args) 
	{
		String a=args[0];
		String b=args[1];
		for(int i=0;i<a.length()||i<b.length();i++)
		{
			if(i<a.length())
				System.out.print(a.charAt(i));
			if(i<b.length())
				System.out.print(b.charAt(i));
		}
	}

}
