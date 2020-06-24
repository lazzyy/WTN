package com.wipro.classes_objects;

class Calculator
{
	public static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
}

public class Assignment2 
{

	public static void main(String[] args) 
	{
		//Calculator c=new Calculator();
		System.out.println("For Integer's: "+Calculator.powerInt(2,3));
		System.out.println("For double's: "+Calculator.powerDouble(2.0, 3.0));
	}

}