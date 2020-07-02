package com.wipro.exception_handling;
class InvalidCountryException extends Exception
{
	public InvalidCountryException(String s)
	{
		super(s);
	}
}
public class Excep_Assignment4 
{

	public static void main(String[] args) 
	{
		Excep_Assignment4 ex=new Excep_Assignment4();
		try
		{
			ex.registerUser("Lazzyy","Japan");//Outside India Case
			ex.registerUser("Ram","India");//Successful Case
		}
		catch(InvalidCountryException e)
		{
			System.out.println("You are Caught!");
			System.out.println(e.getMessage());
		}
	}
	void registerUser(String name,String country) throws InvalidCountryException
	{
		if(!country.equals("India"))
		{
			throw new InvalidCountryException("User outside India can't be registered");
		}
		else
		{
			System.out.println("Registration is Successful");
		}
	}

}
