package com.wipro.overriding_polymorphism;
/*Create  a base class Fruit with name ,taste and size as its attributes.
 *Create a method called eat() which describes the name of the fruit and its taste. 
 *Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
 */
class Fruit
{
	String Name,Taste,Size;
	Fruit(String Name,String Taste,String Size)
	{
		this.Name=Name;
		this.Taste=Taste;
		this.Size=Size;
	}
	void Eat()
	{
		System.out.println(Name+" is "+Taste);
	}
}
class Orange extends Fruit
{
	Orange(String Name,String Taste,String Size)
	{
		super(Name,Taste,Size);
	}
	void Eat()
	{
		System.out.println(Name+" is "+Taste);
	}
}
class Apple extends Fruit
{
	Apple(String Name,String Taste,String Size)
	{
		super(Name,Taste,Size);
	}
	void Eat()
	{
		System.out.println(Name+" is "+Taste);
	}
}
public class Assignment1 
{

	public static void main(String[] args) 
	{
		Orange O=new Orange("Orange","Sour","Medium");
		O.Eat();
		Apple A=new Apple("Apple","Sweet","Medium");
		A.Eat();
	}

}
