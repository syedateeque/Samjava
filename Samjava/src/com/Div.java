package com;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		int c;
		
		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = new Scanner(System.in);
		System.out.println("The value of a = ");
	    int a = sc1.nextInt();
	    System.out.println("The value of b = ");
	    int b = sc2.nextInt();
	    
			c = a / b;
			System.out.println("Answer for division problem is = " +c);
		

		}

	}
