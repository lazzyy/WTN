package com.wipro.abstract_classes;

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