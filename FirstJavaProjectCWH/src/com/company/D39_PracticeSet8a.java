package com.company;

//Problem 1
/*
Create a class Employee with following properties
Salary(property)(int)
getSalary(method returning int)
name(property)(String)
getName(method returning String)
setName(method changing name)
*/
class Employee1{
	int salary;
	String name;
		
	public int getSalary(){
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
}

//Problem 2
//Create a class cellphone with methods to print "ringing...", "vibrating...", etc
class Cellphone{
	public void ring() {
		System.out.println("Ringing...");
	}
	public void vibrate() {
		System.out.println("Vibrating...");
	}
	public void callFriend() {
		System.out.println("Calling Friend...");
	}
}

//Problem 3
//Create a class square to initialize its side, calculating area, perimeter,etc
class Square{
	int side;
	
	public int area() {
		return side*side;
	}
	
	public int perimeter() {
		return 4*side;
	}
}

//Problem 4
//Create a class rectangle to initialize its side, calculating area, perimeter,etc
class Rectangle{
	int length;
	int width;
	public int area() {
		return length*width;
	}
	
	public int perimeter() {
		return 2*(length+width);
	}
}

//Problem 5
/*Create a class TommyVecetti for Rockstar Games capable of 
  hitting(print hitting...), running, firing, ect...
*/

class tommyVecetti{
	public void hit() {
		System.out.println("Hitting the enemy");
	}
	
	public void run() {
		System.out.println("Running from the enemy");
	}
	
	public void fire() {
		System.out.println("Firing on the enemy");
	}
}

//Problem 6
//Create a class circle to initialize its side, calculating area, perimeter,etc
class Circle{
	int radius;
	public double area() {
		return (3.14 * radius);
	}
	
	public double perimeter() {
		return (2 * 3.14 * radius);
	}
}


public class D39_PracticeSet8a {

	public static void main(String[] args) {
		 /*
		//Problem 1
		Employee1 harry = new Employee1();
		harry.setName("CodeWihtHarry");
		System.out.println(harry.getName());
		
		harry.salary=233;
		System.out.println(harry.getSalary());
		
		
		//Problem 2
		Cellphone phone = new Cellphone();
		phone.ring();
		phone.vibrate();
		phone.callFriend();
		
		
		//Problem 3
		Square sq = new Square();
		sq.side = 3;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
		
		
		//Problem 4
		Rectangle rec = new Rectangle();
		rec.length=4;
		rec.width=2;
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
		
		
		//Problem 5
		tommyVecetti vc = new tommyVecetti();
		vc.hit();
		vc.run();
		vc.fire();
		*/
		
		//Problem 6
		Circle c = new Circle();
		c.radius=2;
		System.out.println(c.area());
		System.out.println(c.perimeter());
	}

}
