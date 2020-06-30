package com.wipro.String_StringBuffer;
//Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
//You may assume that n is between 0 and the length of the string, inclusive. 
public class Assignment10_Strings 
{

	public static void main(String[] args) 
	{
		String s=args[0];
		int a=Integer.parseInt(args[1]);
		String ns="";
		for(int i=0;i<a;i++)
		{
			ns+=s.substring(s.length()-a,s.length());
		}
		System.out.println(ns);
	}

}
