package com.wipro.flowcontrolstatments;
//Write a program to reverse an integer.
public class Problem16 
{

	public static void main(String[] args) 
	{
		/*String s=args[0];
		char[] str=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}*/
		int reverse=0;
		int n=Integer.parseInt(args[0]);
		while(n != 0) 
		{
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
		System.out.println(reverse);
	}

}