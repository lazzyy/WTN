package com.wipro.classes_objects;

class Box
{
	private double width;
	private double height;
	private double depth;
	public Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double getVolume()
	{
		return (width*height*depth);
	}
	
}

public class Assignment1 
{

	public static void main(String[] args) 
	{
		double w=Float.parseFloat(args[0]);
		double h=Float.parseFloat(args[1]);
		double d=Float.parseFloat(args[2]);
		Box b=new Box(w,h,d);
		System.out.println("The volume of the box is : "+b.getVolume());
	}

}
