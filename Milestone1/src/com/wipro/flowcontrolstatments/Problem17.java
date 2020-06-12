package com.wipro.flowcontrolstatments;
//Write a program to check whether given number is palindrome or not.
public class Problem17 
{

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int reverse=0;
		int copy=n;
		while(n != 0) 
		{
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
		if(copy==reverse)
		{
			System.out.println(copy+" is a palindrome");
		}
		else
		{
			System.out.println(copy +" is not a palindrome");
		}
	}

}
