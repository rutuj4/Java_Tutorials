package com.company;

public class D08_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Assignment operator---");
		int a = 4; //Assignment operator
		
		int c = 9;
		c += 3; // Assignment Operator
		System.out.println(c);
		
		System.out.println("---Arithmetic operator---");
		//Arithmetic operator
		int b = 6 % a; // Modulo operator (It returns the remainder)
		System.out.println(b);
		
		
		System.out.println("---Comparison operator---");
		System.out.println(64<3); //Comparison Operator
		
		System.out.println("---Logical operator---");
		System.out.println(64>5 && 64<8); // Logical Operator
		
		System.out.println(64>5 || 65<4);
		
		System.out.println("---Bitwise operator---");
		System.out.println(2&3);
		System.out.println(0&1);
		System.out.println(1&1);
		
//		10
//		00
//		01
//		11
	}

}
