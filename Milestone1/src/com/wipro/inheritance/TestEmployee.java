package com.wipro.inheritance;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee E=new Employee("Ram Kumar", 5000000, 2021, "CT20000922");
		E.setName("Ram Kumar");
		E.setAnnual_sal(5000000);
		E.setJoining_yr(2021);
		E.setNational_ins_no("CT20000922");
		System.out.println("Name: "+E.getName()+"\nAnnual Salary: "+E.getAnnual_sal()+"\nJoining year: "+E.getJoining_yr()+"\nNational Insurance No.: "+E.getNational_ins_no());
	}

}
