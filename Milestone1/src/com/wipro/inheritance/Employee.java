package com.wipro.inheritance;
/*
 * Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), 
 * the year the employee started to work, and the national insurance number which is a String.
 * Save this in a file called Employee.javaYour class should have the necessary constructors and getter/setter methods.
 */
public class Employee extends Person
{
	private double Annual_sal;
	private int Joining_yr;
	private String National_ins_no;
	public Employee(String name,double Annual_sal,int Joining_yr,String National_ins_no) 
	{
		super(name);
		this.Annual_sal=Annual_sal;
		this.Joining_yr=Joining_yr;
		this.National_ins_no=National_ins_no;
	}
	public double getAnnual_sal()
	{
		return Annual_sal;
	}
	public void setAnnual_sal(double Annual_sal)
	{
		this.Annual_sal=Annual_sal;
	}
	public int getJoining_yr()
	{
		return Joining_yr;
	}
	public void setJoining_yr(int Joining_yr)
	{
		this.Joining_yr=Joining_yr;
	}
	public String getNational_ins_no()
	{
		return National_ins_no;
	}
	public void setNational_ins_no(String National_ins_no)
	{
		this.National_ins_no=National_ins_no;
	}
}
