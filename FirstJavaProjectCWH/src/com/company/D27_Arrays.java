package com.company;

public class D27_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
		String [] students = {"Harry", "Rohan", "Shubham", "Lovish"}; 
		System.out.println(marks[0]);
		System.out.println(students[2]);
		*/
		
		int [] marks = {98, 45, 79, 99, 80};
		
		// Length of an array
		// System.out.println(marks.length); 
		
		//Displaying the array (Naive)
//		System.out.println("Printing using for loop");
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
		
		//Displaying the array (for loop)
		System.out.println("Printing using for loop");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//Displaying the array in reverse order(for loop)
		System.out.println("Printing In reverse order");
		for (int i = marks.length-1; i >= 0; i--) {
			System.out.println(marks[i]);
		}
		
		//Displaying the array(for - each loop)
		System.out.println("Printing using for-each loop");
		for(int element: marks) {
			System.out.println(element);
		}
	}

}
