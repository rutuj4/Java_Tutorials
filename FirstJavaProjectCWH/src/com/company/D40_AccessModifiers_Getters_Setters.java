package com.company;

class MyEmployee{
	private int id;
	private String name;
	//Setters and Getters
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
}

public class D40_AccessModifiers_Getters_Setters {

	public static void main(String[] args) {
		 MyEmployee harry = new MyEmployee();
		 // harry.id = 45;
		 // harry.name = "CodeWihtHarry"; --> Throws an error due to private access modifier
		 harry.setName("CodeWithHarry");
		 System.out.println(harry.getName());
		 
		 harry.setId(45);
		 System.out.println(harry.getId());
	}

}
