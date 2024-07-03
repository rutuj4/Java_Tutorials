package com.company;

public class D14_StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Methods 1");
		System.out.println("---------------");
		String name = "Rutuj";
		System.out.println(name); 
		
		int length = name.length();
		System.out.println(length);
		
		String lstring = name.toLowerCase();
		System.out.println(lstring);
		
		String ustring = name.toUpperCase();
		System.out.println(ustring);
		
		String nonTrimmedString = "   Rutuj    ";
		System.out.println(nonTrimmedString);
		System.out.println(nonTrimmedString.trim());
		
	}

}
