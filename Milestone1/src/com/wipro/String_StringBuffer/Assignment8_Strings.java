package com.wipro.String_StringBuffer;
//Write a Java program that accepts a string (with * in it). 
//The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
public class Assignment8_Strings 
{

	public static void main(String[] args) 
	{
		String str=args[0];
		String out = "";
		  for (int i = 0; i < str.length(); i++) 
		  {
		    if (str.charAt(i) == '*' || (i > 0 && str.charAt(i-1) == '*')) 
		      continue;
		    if (i < str.length()-1 && str.charAt(i+1) == '*') 
		      continue;
		    out = out + str.charAt(i);
		  }
		  System.out.println(out);
	}

}
