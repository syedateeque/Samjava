package com;

public class WrapperClassDemo {

	public static void main(String[] args) {
	// Unboxing
	Integer i=new Integer(10);
	System.out.println(i);
	int b=i.intValue();
	System.out.println(b);
	
	Float f=new Float(22.34f);
	System.out.println(f);
	float c=f.floatValue();
	System.out.println(c);
	
	//Autoboxing
	int a=100;
	Integer i1=a;
	int d=i1.intValue();
	System.out.println();
	
	String s1=i1.toString();
	System.out.println(s1);
	
	

	}

}
