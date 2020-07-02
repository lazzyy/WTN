package com.wipro.abstract_classes;
/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 
*public abstract String notice();
*Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
*Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment. 
*/
abstract class Compartment 
{
	public abstract String notice();
}
class Firstclass extends Compartment
{
	public String notice()
	{
		return("This is Firstclass Compartment");
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return("This is Ladies Compartment");
	}
}
class General extends Compartment
{
	public String notice()
	{
		return("This is General Compartment");
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return("This is Luggage Compartment");
	}
}