package com.wipro.flowcontrolstatments;
//Write a program to write color according to the give color code.
public class Problem8 
{

	public static void main(String[] args) 
	{
		char c=args[0].charAt(0);
		switch (c)
		{
		case 'R':System.out.println("Red");break;
		case 'B':System.out.println("Blue");break;
		case 'G':System.out.println("Green");break;
		case 'O':System.out.println("Orange");break;
		case 'Y':System.out.println("Yellow");break;
		case 'W':System.out.println("White");break;
		default:System.out.println("Invalid Code");break;
		}
	}

}
