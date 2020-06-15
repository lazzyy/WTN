package com.wipro.flowcontrolstatments;
//Change the character input to upeercase if it is in lowercase and lowercase if it is in uppercase.
public class Problem7 
{

	public static void main(String[] args) 
	{
		char c=args[0].charAt(0);
		if(c>='a' &&c<='z')
		{
			c=(char)(c-32);
			System.out.println(c);
		}
		else
		{
			c=(char)(c+32);
			System.out.println(c);
		}
	}

}