package com.company;

public class D25_PracticeSet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Problem 1
		
//Write a program to print the pattern
//		int n = 4;	
//		for (int i = n; i>0; i--) {
//			for(int j = 0;j<i;j++) {				
//				System.out.print("*");
//			}
//			System.out.println("\n");
//		}
		
		
				//Problem 2		
		
//Pgm to sum first n even nos, using while loop
//		int sum = 0;
//		int n = 3;
		
//		int i = 0;
//		while(i<n) {
//			sum = sum + (2*i);
//			i++;
//		}
		
		/*------for loop------*/
		
/*		for(int i = 0;i<n;i++) {
			sum = sum + (2*i);
		}
*/		
//		System.out.print("Sum of even nos is: ");
//		System.out.println(sum);
		
		
				//Problem 3	
		
//Pgm to print multiplication table of a given number n
//		int n = 5;
//		for(int i = 1;i<=10;i++) {
//			System.out.printf("%d x %d = %d \n", n,i, n*i);
//		/*	System.out.println(n*i);  */
//		}
		
		
				//Problem 4
		
//Pgm to print multiplication table of 10 in reverse order
//		int n =10;
//		for(int i = 10;i>=1;i--) {
//			System.out.printf("%d x %d = %d \n", n,i, n*i);
//		/*	System.out.println(n*i);  */
//		}
		
		
				//Problem 5
		
//Same as problem 6, but here use for loop		
		
		
				//Problem 6
		
//Pgm to find the factorial of a number  using while loop
//		int n = 5;
//		int i = 1;
//		int factorial = 1;
//		while(i<=n) {
//			factorial *= i; //Means multiply factorial with i and update factorial.
//			i++;
//		}
//		System.out.println(factorial);
		
		
				//Problem 7
		
// Pgm to repeat 1 using for / while loop
//		int n = 4;	
//		for (int i = n; i>0; i--) {
//			for(int j = 0;j<i;j++) {				
//				System.out.print("1");
//			}
//			System.out.println("\n");
//		}
		
		 
				//Problem 9

// Pgm to calculate the sum of the numbers occuring in the multiplication table of 8
		int n = 8;
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += n*i;  
		}
		System.out.println(sum);
		
		
	}
}