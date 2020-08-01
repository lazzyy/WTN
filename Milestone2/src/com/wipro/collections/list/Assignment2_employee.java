package com.wipro.collections.list;
import java.util.*;
class Employee1
{
	String name;
	int empid;
	int sal;
	public Employee1(int empid,String name,int sal) {
		this.name = name;
		this.empid = empid;
		this.sal = sal;
	}
	
}
public class Assignment2_employee {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<Employee1> v=new Vector<Employee1>();
        Employee1 e=new Employee1(101,"Ram",100000);
        Employee1 e1=new Employee1(102,"Kumar",60000);
        v.add(e);
        v.add(e1);
        System.out.println("Iterator type: ");
        Iterator i=v.iterator();
        Employee1 s;
        while(i.hasNext())
        {
        	s=(Employee1)i.next();
        	System.out.println(s.empid+" "+s.name+" "+s.sal);
        }
        System.out.println("Enumeration type : ");
        Enumeration en=v.elements();
        while(en.hasMoreElements())
        {
        	s=(Employee1)en.nextElement();
        	System.out.println(s.empid+" "+s.name+" "+s.sal);
        }
	}

}
