package com.wipro.encapsulation_abstraction;

class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender)
	{
		super();
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	@Override
	public String toString()
	{
		return "name = " + name + ", email=" + email + ", gender=" + gender;
	}
}

class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyinStock;
	public Book(String name,Author author,double price,int qtyinStock)
	{
		super();
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyinStock=qtyinStock;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int qtyinStock()
	{
		return qtyinStock;
	}
	public void setqtyinStock(int qtyinStock)
	{
		this.qtyinStock=qtyinStock;
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
	@Override
	public String toString()
	{
		return "Book name = " + name + ", author " + author + ", price=" + price + ", qtyInStock=" + qtyinStock;
	}
}

public class Assignment1 
{

	public static void main(String[] args) 
	{
		Author author = new Author("Ram Kumar","ramkumar2292000@gmail.com",'M');
		Book book=new Book("Peace in Life",author,1299.0,500);
		System.out.println(book);
	}

}