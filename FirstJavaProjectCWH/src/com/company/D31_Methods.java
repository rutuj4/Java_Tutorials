package com.company;

public class D31_Methods {

	static int logic(int x, int y) {
		int z;
		if(x>y) {
			z = x + y;
		}
		else {
			z = (x+y)*5;
		}
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 7;
		int c = logic(a,b);
		System.out.println(c);
		
		/*
		int a = 5;
		int b = 7;
		int c;
		if(a>b) {
			c = a + b;
		}
		else {
			c = (a+b)*5;
		}
		System.out.println(c);
		*/
		
			
		
	}
}