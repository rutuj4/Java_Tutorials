package com.company;

class MyMainEmployee{
	private int id;
	private String name;
	
//	public MyMainEmployee() {
//		id = 45;
//		name = "Your-Name-Here";
//	}
	
	public MyMainEmployee(String myName, int myId) {
		id = myId;
		name = myName;
	}
	
	
	public void setName(String n) { name = n; }
	public String getName() { return name; }
	public void setId(int i) { id = i;	}
	public int getId() { return id;	}
	
}

public class D42_Constructors {

	public static void main(String[] args) {
		  MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry",12);
		  System.out.println(harry.getId());
		  System.out.println(harry.getName());
	}

}