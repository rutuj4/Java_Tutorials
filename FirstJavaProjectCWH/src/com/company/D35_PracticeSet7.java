package com.company;
import java.util.Scanner;

public class D35_PracticeSet7 {

	
	//Problem 1
	static void multiplication(int n) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}
	}
	
	//Problem 2
	static void pattern1(int n){
		for(int i = 0;i<n;i++) {        //Rows
			for(int j = 0;j<i+1;j++) {  //Columns OR *
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//Problem 3
	//sum(n) = 1 + 2 + 3... + n
	//sum(n) = 1 + 2 + 3... + n-1 + n
	//sum(n) = sum(n-1) + n
	
	//sum(3)=3 + sum (2)
	//sum(3)=3 + 2 + sum (1)
	//sum(3)=3 + 2 + 1
	static int sumRec(int n) {
		//Base condition
		if(n == 1) {
			return 1;
		}
		else {
			return n + sumRec(n-1);
		}
	}
	
	
	//Problem 4
	static void pattern2(int n) {
		for(int i = 0; i <= n ; i++) {
			for(int j = 0; j<n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	//Probelm 5
	static int fib(int n) {
		/*
		if(n == 1) {
			return 0;
		}
		else if(n == 2) {
			return 1;
		}
		*/
		if(n == 1 || n == 2) {
			return n - 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	
	// Problem 6
	static double avg(double ...arr) {
		// Available as double [] arr;
		//We are using Variable Arguments
		double sum = 0;
		for(double a:arr) { //for each loop
			sum +=a;
		}
		return sum/arr.length;
	}
	
	
	// Problem 8
	static void pattern1_rec(int n){
		
		if(n>0) {
			pattern1_rec(n-1);
			for(int i = 0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//pattern1_rec(3)
	//pattern1_rec(2) + 3 times star and a new line
	//pattern1_rec(1) + 2 times star and a new line + 3 times star and a new line
	//pattern1_rec(0) + 1 time star and a new line + 2 times star and a new line + 3 times star and a new line
	
	
	//Problem 9
	static double temperature(float c) {
		return (c*1.8)+32;
	}
	
	public static void main(String[] args) {
		
		// Problem 1 - Java method to print multiplication of a number n
		// multiplication(7);	
		
		// Problem 2 - Program to print the * pattern
		// pattern1(4);
		
		// Problem 3 - Recursive function to calculate sum of first n natural numbers
		// int c = sumRec(3);
		// System.out.println(c);
		
		// Problem 4 - Program to print the * pattern
		// pattern2(4);
		
		// Problem 5 - Func to print n th term of fibonacci series using recursion
		// fibonacci series - 0,1,1,2,3,5,8,13,21,34
		// int result = fib(7);
		// System.out.println(result);
		
		// Problem 6 - Func to find average of set of a set of numbers passed as arguments
		// System.out.println(avg(1,2,3,4,5));
		// System.out.println(avg(10,20,30));
		
		// Problem 8 - repeat 2 using recursion
		// pattern1_rec(3);
		
		// Problem 9 - Func to convert Celsius temp into Fahrenheit
		Scanner T = new Scanner(System.in);
		System.out.println("Enter the calue of Celsius(C): ");
		float t = T.nextFloat();
		System.out.println("Celsius to Fahreheit Temp is: "+temperature(t)+"F");
	}

}
