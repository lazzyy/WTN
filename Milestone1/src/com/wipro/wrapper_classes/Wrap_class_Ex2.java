package com.wipro.wrapper_classes;

public class Wrap_class_Ex2 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		System.out.println("Given Number :"+a);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(a));
		System.out.println("Octal equivalent :"+Integer.toOctalString(a));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(a));
	}
}