package com;

class person
{
	void display() 
	{
	System.out.println("The man is slow");
	}
}
class eat extends person
{
	@Override
	void display()
	{
		
		System.out.println("The man is eating");
	}
}
public class Overriding 
{

	public static void main(String[] args) 
	{
		eat obj = new eat();
		{
			obj.display();
		}

	}

}