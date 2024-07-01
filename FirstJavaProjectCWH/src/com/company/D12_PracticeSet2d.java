package com.company;
import java.util.Scanner;
public class D12_PracticeSet2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write the following expression in java program: (v*v - u*u)/(2*a*s)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of v");
		int v = sc.nextInt();
		System.out.println("Enter the value of u");
		int u = sc.nextInt();
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of s");
		int s = sc.nextInt();
		float result = (v*v - u*u)/(2*a*s);
		System.out.println(result);
		
	}

}
