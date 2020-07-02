package com.wipro.abstract_classes;
import java.util.Random;
/*Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/
public class TestCompartment 
{

	public static void main(String[] args) 
	{
		Random rand=new Random();
		Compartment []c=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			int n=rand.nextInt(4);
			if(n==0)
			{
				c[i]=new Firstclass();
			}
			if(n==1)
			{
				c[i]=new Ladies();
			}
			if(n==2)
			{
				c[i]=new General();
			}
			if(n==3)
			{
				c[i]=new Luggage();
			}
			System.out.println(c[i].notice());
		}
	}

}
