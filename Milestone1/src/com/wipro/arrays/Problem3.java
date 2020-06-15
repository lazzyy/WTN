package com.wipro.arrays;
//Check if a given number is present or not in the array.
public class Problem3 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,55,89};
		int index=-99,key=10;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				index=i;break;
			}
		}
		if(index==-99)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(index);
		}
		
	}

}
