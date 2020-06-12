package com.wipro.flowcontrolstatments;
//Check if the program has received command line arguments or not
public class Problem3 
{

	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("No values");
		}
		else
		{
			int k=args.length;
			System.out.print(args[0]);
			for(int i=1;i<k;i++)
			{
				System.out.print(","+args[i]);
			}
		}
		//Give input through command prompt like this
		//javac Problem3.java
		//java Problem3 (any input)
		//or If you use Eclipse goto ->Run->Run Configurations->Arguments and give input
	}

}
