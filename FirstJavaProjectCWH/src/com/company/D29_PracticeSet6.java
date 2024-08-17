package com.company;

public class D29_PracticeSet6 {

	public static void main(String[] args) {
		//Practice Problem 1
//Create an array of 5 floats and calculate their sums
		/*
		float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
		float sum = 0;
		for(float element: marks) {
			sum = sum + element;
		}
		System.out.println("The value of sum is " + sum);
		*/
		
		
		//Practice Problem 2
//Write a program to find out whether a given integer is present in an array or not
		/*
		float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
		float num = 45.7f;
		boolean isInArray = false;
		//for-each loop
		for(float element: marks) {
			if(num == element) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The value is present in the array");
		}
		else {
			System.out.println("The value is not present in the array");
		}
		*/
		
		//Practice Problem 3
//Calculate the avg marks from an array containing mark of all students in Physics using for-each loop
		/*
		float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
		float sum = 0;
		for(float element: marks) {
			sum = sum + element;
		}
		System.out.println("The value of average marks is " + sum/marks.length);
		*/
		
		
		//Practice Problem 4
//Create a java program to add 2 matrices of size 2x3
		/*
		int [][] mat1 = {{1, 2, 3},
						 {4, 5, 6}};
		
		int [][] mat2 = {{2, 6, 13},
						 {3, 7, 1}};
		
		int [][] result = {{0, 0, 0},
						   {0, 0, 0}};
		
		for(int i=0;i<mat1.length;i++) { //Row number of times
			for(int j=0;j<mat1[i].length;j++) { //Column number of times
				System.out.format("Setting value for i=%d and j=%d\n",i, j);
				result[i][j] = mat1[i][j] + mat2[i][j];
			}	
		}
		
		for(int i=0;i<mat1.length;i++) { //Row number of times
			for(int j=0;j<mat1[i].length;j++) { //Column number of times
				System.out.print(result[i][j] + " ");
				result[i][j] = mat1[i][j] + mat2[i][j];
			}	
			System.out.println("");
		}
		*/
		
		
		//Practice Problem 5
//Create a java program to reverse an array
		
		//Check Pg no 35 in Java notes for explanation
		
		/*
		int [] arr = {1, 2, 3, 4, 5, 6};
		int l = arr.length;
		int n = Math.floorDiv(l,2); //It will divide and it won't return the decimal value
		int temp;
		for(int i=0;i<n;i++) {
			//Swap a[i] and a[l-1-i]
			//a b temp
			// |4| |3| ||
			temp = arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
			//Check page number 35 in Java notes for explanation
		}
		for (int element: arr) {
			System.out.print(element);
		}
		*/
		
		
		//Practice Problem 6
//Program to find maximum element in an array
		/*
		int [] arr = {1, 21, 3, 455, 34, 67};
		int max = 0;
		//OR
		// int max = Integer.MIN_VALUE;
		for(int element: arr) {
			if(element>max) {
				//If anywhere in the array, I find an element that is grater than the existing max value, then I'l replace the max value with with element.
				max = element;
			}
		}
		System.out.println(max);
		*/
		
		
		//Practice Problem 7
//Program to find minimum element in an array
		/*
		int[]arr= {20, 55, 65, 4555, 895, 1000};
		int min = Integer.MAX_VALUE;
		for(int element: arr) {
			if(element<min) {
				min = element;
			}
		}
		System.out.println(min);
	    */
	
		
		//Practice Problem 8
//Program to find whether an array is sorted or not
		/*
		boolean isSorted = true;
//		int[]arr= {1, 2100, 3, 455, 5, 34, 67};
		int[]arr= {1,2,3,4,5};
		for(int i = 0 ; i<arr.length-1 ; i++) {
			if(arr [i] > arr [i+1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("The Array is sorted");
		}
		else {
			System.out.println("The Array is not sorted");
		}
		*/
		
		
	}
}
