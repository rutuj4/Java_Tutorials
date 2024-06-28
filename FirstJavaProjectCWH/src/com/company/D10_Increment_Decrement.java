package com.company;

public class D10_Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 56;
		//int b = i++; First b is assigned i, then i is incremented
		int j = 67;
		int c = ++j; // First j is incremented then c is assigned j
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i); 
		
		int y = 7;
		System.out.println(++y * 8);
		
		char ch = 'a';
		System.out.println(++ch);
	}

}
