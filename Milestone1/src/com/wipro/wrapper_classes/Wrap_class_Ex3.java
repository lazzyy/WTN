package com.wipro.wrapper_classes;

import java.util.Scanner;

public class Wrap_class_Ex3 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String main=String.format("%8s",Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(main);
		s.close();
	}

}
