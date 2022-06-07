package com;

import java.util.Scanner;

public class Primepractice {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int temp=0;
		for(int i=2;i<=number-1; i++)
		{
			if(number%i==0)
			{
			temp=temp+1;
			}
		}
		if(temp==0) 
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
	}

}