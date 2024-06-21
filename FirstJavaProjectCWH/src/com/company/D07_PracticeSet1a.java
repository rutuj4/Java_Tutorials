package com.company;
import java.util.Scanner;

public class D07_PracticeSet1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to add 3 numbers");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number:");
		float a =sc.nextFloat();
		System.out.print("Enter the 2nd number:");
		float b =sc.nextFloat();
		System.out.print("Enter the 3rd number:");
		float c =sc.nextFloat();
		
		float sum = a + b+ c;
		System.out.print("Sum of three numbers is:");
		System.out.println(sum);
	}

}
