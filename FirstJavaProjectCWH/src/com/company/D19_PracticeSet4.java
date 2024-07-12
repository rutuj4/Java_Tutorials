package com.company;
import java.util.Scanner;

public class D19_PracticeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Video link: https://youtu.be/lGHzXsEoUkM?si=1tnYhFFWfhA72LS-		
//Problem 1		
//		System.out.println("Output of the following program");
//		int a = 10;
//		if(a = 11) {
//			// If  give = it will throw an error, coz = is an assignment operator and == is an relational operator, here we should use ==.
//			System.out.println("I am 11");
//		}
//		else {
//			System.out.println("I am not 11");
//		}

		
//Problem 2		
//pgm to find whether the student is pass or fail
//		Scanner sc = new Scanner(System.in);
//		byte m1, m2, m3;
//		System.out.println("Enter the marks of subject 1");
//		m1 = sc.nextByte();
//		
//		System.out.println("Enter the marks of subject 2");
//		m2 = sc.nextByte();
//		
//		System.out.println("Enter the marks of subject 3");
//		m3 = sc.nextByte();
//		
//		float avg = (m1 + m2 + m3)/3.0f;
//		System.out.println("Your overall percentage is: "+avg);
//		if (avg >= 40 && m1>=33 && m2>=33 && m3>=33) {
//			System.out.println("Congratularins! You have being promoted");
//		}
//		else {
//			System.out.println("Sorry! You have not being promoted! Please try again");
//		}
		
		
//Problem 3	
//	Calculate Income Tax
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your income in Lakhs per annum");
//		float tax = 0;
//		float income = sc.nextFloat(); 
//		
//		if(income <= 2.5) {
//			tax = tax + 0;
//		}
//		else if (income > 2.5f && income <= 5.0f) {
//			tax = tax + 0.05f * (income - 2.5f);
//		}
//		else if (income > 5.0f && income <= 10.0f) {
//			tax = tax + 0.05f * (5.0f - 2.5f);
//			// First pay for the income b/w 2.5 to 5
//			tax = tax + 0.20f * (income - 5.0f);
//			// 20% will be applied on the remaining income
//		}
//		else if (income > 10f) {
//			tax = tax + 0.05f * (5.0f - 2.5f);
//			// First pay for the income b/w 2.5 to 5
//			tax = tax + 0.20f * (10.0f - 5.5f);
//			// 20% will be applied on the remaining income
//			tax = tax + 0.30f * (income - 10.0f);
//		}
//		
//		System.out.println("The total tax paid by the employee is: "+tax);

		
//Problem 4		
//Program to find out the day of the week, given the number (1 for Monday, 2 for Tuesday and so on.....)		
//		Scanner sc = new Scanner(System.in);
//		int day = sc.nextInt();
//		switch(day) {
//		case 1: System.out.println("Monday");
//				break;
//		case 2: System.out.println("Tuesday");
//				break;
//		case 3: System.out.println("Wednesday");
//				break;
//		case 4: System.out.println("Thursday");
//				break;
//		case 5: System.out.println("Friday");
//				break;
//		case 6: System.out.println("Saturday");
//				break;		
//		case 7: System.out.println("Sunday");
//				break;
//		}
		
//Problem 5
//Write a program to find whether a year entered by the user is a leap year or not.
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("Enter the year: ");
//		int year = sc.nextInt();
//		if (year % 4 == 0) {
//			System.out.println("It is a leap year.");
//		}
//		else {
//			System.out.println("Not a leap year");
//		}
		
//Problem 6
//Write a pgm to find out the type of website from the url		
// .com -> Commercial Webiste
// .org -> Organization Webiste	
// .in -> Indian Webiste
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the url of the website: ");
		String website = sc.next();
		if (website.endsWith(".org")) {
			System.out.println("This is an Organizational website");
		}
		else if (website.endsWith(".com")) {
			System.out.println("This is an Commercial website");
		}
		else if (website.endsWith(".in")) {
			System.out.println("This is an Indian website");
		}
	}
}
