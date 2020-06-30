package com.wipro.String_StringBuffer;
//Write a program to check whether given string is palindrome or not.
public class Assignment1_Strings 
{
	public static void main(String[] args) 
	{
		String s=args[0];
		int left=0;
		boolean flag=true;
		int right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)==s.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("The given String is not a Palindrome");
		}
		else
		{
			System.out.println("The given String is a Palindrome");
		}
	}
}