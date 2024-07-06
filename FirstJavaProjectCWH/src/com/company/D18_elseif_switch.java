package com.company;
import java.util.Scanner;

public class D18_elseif_switch {

	public static void main(String[] args) {

//Switch Case		
		String var = "Rutuj";
		
		switch(var) {
		case "Shubham":
			System.out.println("you are going to become an adult");
			break;
		case "Saurav":
			System.out.println("you are going to join a job");
			break;
		case "Vishaka":
			System.out.println("you are going to get retired");
			break;	
		default:
			System.out.println("Enjoy your life!");
		}
		System.out.println("Thanks for using my Java Code!");
		
		
		
//If Else Ladder
		/*
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age>56) {
			System.out.println("you are experienced!");
		}
		else if (age > 46) {
			System.out.println("you are semi-expereinced!");
		}
		else if (age > 36) {
			System.out.println("you are semi-semi-expereinced!");
		}
		else {
			System.out.println("you are not expereinced");
		}
		*/
	}

}
