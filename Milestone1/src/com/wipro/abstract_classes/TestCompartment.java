package com.wipro.abstract_classes;
import java.util.Random;
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
