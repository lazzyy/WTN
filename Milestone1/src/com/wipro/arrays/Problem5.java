package com.wipro.arrays;
//Program to find the largest 2 numbers and the smallest 2 numbers in the given array.
public class Problem5 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,55,89};
		int max1=-999,max2=-999,min1=999,min2=999;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2 = max1;
	            max1 = a[i];
	        }
	        else if(a[i] > max2 && a[i] < max1)
	        {
	            max2 = a[i];
			}
			if(a[i]<min1)
			{
				min2 = min1;
	            min1 = a[i];
	        }
	        else if(a[i] < min2 && a[i] != min1)
	        {
	            min2 = a[i];
			}
		}
		System.out.println("The first max is: "+max1);
		System.out.println("The second max is:"+max2);
		System.out.println("The first min is: "+min1);
		System.out.println("The second min is:"+min2);

	}

}
