package com.company;
import java.util.Scanner;

public class D23_ForLoop {
	
	public static void main(String[] args) {
//		System.out.println("For Loop");
//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		            
		// 2n = Even numbers = 0, 2, 4, 8,....
		// 2n + 1 = Odd numbers = 1, 3, 5, 7, 9,......
//		System.out.println("n Odd numbers are as follows:");
//		int n = 3;
//		for(int i = 0; i<n ; i++) {
//			System.out.println(2*i+1);
//		}
		
// Decrementing for loop		
//		for(int i = 7; i != 0; i--) {
//			System.out.println(i);
//		}
		
//Program to print first n natural numbers in reverse order		
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}