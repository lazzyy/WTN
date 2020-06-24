package com.wipro.inheritance;
/*Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/
class Animal
{
	void eat()
	{
		System.out.println("Method: eat - Animal");
	}
	void sleep()
	{
		System.out.println("Method: sleep - Animal");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Method: eat - Bird");
	}
	void sleep()
	{
		System.out.println("Method: sleep - Bird");
	}
	void fly()
	{
		System.out.println("Method: Fly -  Bird");
	}
}
public class Assignment1 
{
	public static void main(String[] args) 
	{
			Animal A=new Animal();
			A.eat();
			A.sleep();
			Bird B=new Bird();
			B.eat();
			B.sleep();
			B.fly();
	}
}