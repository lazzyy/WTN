package com.wipro.arrays;
import java.util.Arrays;
//Write a program to remove the duplicates in an array.
public class Problem7 
{

	public static void main(String[] args) 
	{
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				break;
			}
			if(a[i]==a[i+1])
			{
				a[i]=-999;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-999)
			{
				System.out.println(a[i]);
			}
		}
	}
}