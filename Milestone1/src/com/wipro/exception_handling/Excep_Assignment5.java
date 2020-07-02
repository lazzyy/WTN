package com.wipro.exception_handling;
class AgeException extends Exception
{
	public AgeException(String s)
	{
		super(s);
	}
}
public class Excep_Assignment5 
{

	public static void main(String[] args) 
	{
		String s=args[0];
		int age=Integer.parseInt(args[1]);
		try
		{
			if(age>=18 && age<=60)
			{
				System.out.println("Entered Successfully");
			}
			else
			{
				throw new AgeException("Age is invalid");
			}
		}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
