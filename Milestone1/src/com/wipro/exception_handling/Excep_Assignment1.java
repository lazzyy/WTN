package com.wipro.exception_handling;
import java.util.*;
public class Excep_Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			try
			{
				a[i]=s.nextInt();
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Enter the index of the element you want to be access");
		int index=s.nextInt();
		try
		{
			int element=a[index];
			System.out.println("The array element at index "+index+" = "+element);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.exit(0);
		}
		s.close();
		System.out.println("The array element is successfully accessed");	
	}
}