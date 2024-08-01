package com.company;

public class D26_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Classroom of 500 students - You have to store marks of these 500 students
		2 options:
		1. Create 500 variables
		2. use Arrays
		*/
		
//There are 3 main ways to cretae arrays in java

//1. Declaration and Memory Allocation
		
		//int [] marks = new int[5]; Declaration + Memory Allocation
	
//2. Declaration and then Memory Allocation		
		
		//int [] marks;          //Declaration
		//marks = new int [5];   //Memory Allocation

		//Initialization
		
		//marks [0] = 100;
		//marks [1] = 60;
		//marks [2] = 70;
		//marks [3] = 90;
		//marks [4] = 86;
		//marks [5] = 96; - Throws an error
		
//3. Declaration, Memory Allocation	and initialization together
		
		int[]marks= {100,70,80,71,98};
		
		System.out.println(marks[2]);
	}

}
