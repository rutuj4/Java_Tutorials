package com.company;

public class D09_Operator_Presidence1 {

	public static void main(String[] args) {
		//PRECEDENCE & ASSOCIATIVITY
		System.out.println("//PRECEDENCE & ASSOCIATIVITY");
		
		int a = 6*5-34/2;
		System.out.println(a);
		/*
		Highest precedence goes to * and /. they are they evaluated on the basis 
		of left-to-right associativity.
		= 30-34/2
		= 30-17
		= 13 
		*/
		
		int b = 60/5-34*2;
		System.out.println(b);
		/*
		= 12-34*2
		= 12-68
		= -56		
		*/
	}

}
