package com.company;

//In one Java file, there can only be one public class
class Employee{
	int id;
	int salary;
	String name;
	public void printDetails() {
		System.out.println("My id is " + id);
		System.out.println("My name is " + name);
		
	}
	
	public int getSalary(){
		return salary;
	}
}

public class D38_CustomClass {

	public static void main(String[] args) {
		System.out.println("This is our custom class");
		Employee harry = new Employee(); //Instantiating a new Employee object
		Employee john = new Employee();
		
		//Setting Attributes for Harry
		harry.id=12;
		harry.name = "CodeWithHarry";
		harry.salary = 34;
		
		//Setting Attributes for John
		john.id=13;
		john.name="John Tripathi";
		john.salary = 12;
				
		//Printing the attributes
		harry.printDetails();
		john.printDetails();
		int salary = john.getSalary();
		
		System.out.println(salary);
		//System.out.println(harry.id);
		//System.out.println(harry.name);
	}

}
