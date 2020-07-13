package com.wipro.wrapper_classes;
class Employee implements Cloneable
{
	private String name;
	public Employee(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public Employee clone()
	{
		try
		{
			return (Employee)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning not Allowed");
			return this;
		}
	}
}
public class Wrap_class_Ex4 {

	public static void main(String[] args) 
	{
		Employee n=new Employee("Sherlock Holmes");
		Employee nclone=n.clone();
		nclone.setName("Robert Down Jr");
		System.out.println(nclone.getName());
		System.out.println(n.getName());
	}

}
