package com.company;
import java.util.Scanner;

public class D07_PracticeSet1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java program that asks the user his/her name and greets them, Hello <name>, Have a good day!");
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = sc.next();
		
		System.out.println("Hello "+name+", Have a good day!");
	}

}
