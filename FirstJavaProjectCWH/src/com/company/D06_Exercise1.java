package com.company;
import java.util.Scanner;

public class D06_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to - CBSE Percentage Calculator");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the marks of Subject 1");
	float s1 = sc.nextFloat();
	System.out.println("Enter the marks of Subject 2");
	float s2 = sc.nextFloat();
	System.out.println("Enter the marks of Subject 3");
	float s3 = sc.nextFloat();
	System.out.println("Enter the marks of Subject 4");
	float s4 = sc.nextFloat();
	System.out.println("Enter the marks of Subject 5");
	float s5 = sc.nextFloat();
	
	float sum = s1 + s2 + s3 + s4 + s5;
	System.out.print("Total marks are :");
	System.out.println(sum);
	
//	float total = 500;
	float percentage = (sum/500f)*100;
	System.out.print("Percentage: ");
	System.out.println(percentage);
	}

}
