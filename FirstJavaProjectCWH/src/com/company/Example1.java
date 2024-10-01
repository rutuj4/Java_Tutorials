package com.company;

class Employeee{
	int id;
	String name;
	int salary;
	
	public void printDetails() {
		System.out.println("My id is "+id);
		System.out.println("My name is "+name);
		System.out.println("Salary is "+ salary);
	}
	
	
	public int getSalary() {
		return salary;
	}
}

public class Example1 {

	public static void main(String[] args) {
		System.out.println("This is our custom class");
		Employeee harry = new Employeee();
		Employeee john = new Employeee();
		//Setting attributes
		harry.id = 12;
		harry.name="CodeWithHarry";
		harry.salary=25000;
		
		john.id = 13;
		john.name="John Khandelwal";
		john.salary=35000;
		
		//Printing the attributes
		//System.out.println(harry.id);
		//System.out.println(harry.name);
		harry.printDetails();
		john.printDetails();
		int salary= john.getSalary();
		System.out.println(salary);
	
	}

} 