package com.company;
import java.util.Scanner;

public class D05_TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking user input");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1");
//		int a = sc.nextInt();
		float a = sc.nextFloat();
		System.out.println("Enter number 2");
//		int b = sc.nextInt();
		float b = sc.nextFloat();
//		int sum = a + b;
		float sum = a + b;
		System.out.println("The sum of these numbers is");
		System.out.println(sum);
		
// 1. Reading and Printing a string 
		
//		String str = sc.nextLine(); 
//		System.out.println(str);
		//If you give only sc.next(), then it will print only the first word of the string.
		//But if we give sc.nectLine(), then it will print the entire sentence.
		
// 2. Checking whether the given number is integer or not	
		
//		boolean b1 = sc.hasNextInt();
//		System.out.println(b1); //here we are checking whether the given number is integer or not.
	}

}
