package com.company;
import java.util.Scanner;

public class D07_PracticeSet1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to convert Kilometers to miles");
		
		System.out.println("Enter distance in kilometers: ");
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		
		
		double m = km * 0.621371;
		System.out.println("Miles = " + m);
	}

}
