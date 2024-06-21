package com.company;
import java.util.Scanner;

public class D07_PracticeSet1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program to calculate CGPA using marks of 3 subjects");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of 1st subject");
		float a = sc.nextFloat();
		System.out.println("Enter marks of 2nd subject");
		float b = sc.nextFloat();
		System.out.println("Enter marks of 3rd subject");
		float c = sc.nextFloat();
		
		float cgpa = (a + b + c)/30;
		System.out.print("CGPA:");
		System.out.println(cgpa);
	}

}
