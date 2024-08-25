package com.company;

public class D31_Methods {

	//Static method can be called directly in the main method, but to call non -  static method, we should create an object
	
	// Creating a method
	//If we make this method static, then we can directly call this method in the main method. int c = logic(a,b);

//A static method	
	
	/*
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
	*/
	
//A non static method
	
	int logic(int x, int y) {
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
		
		int a = 5;
		int b = 7;
		int c;
		
		//Calling a non - static method		
		D31_Methods obj = new D31_Methods(); //Creating an object
		c = obj.logic(a,b); 

		//Calling static method		
//		int c = logic(a,b); 
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