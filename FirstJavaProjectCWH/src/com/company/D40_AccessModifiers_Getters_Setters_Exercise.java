package com.company;

class MyCircle{
	double radius;
	double area;
	double peri;
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calculateArea() {
		return 3.14 * (radius * radius);
	}
	
	public double calculatePerimeter() {
		return 2 * 3.14 * radius;
	}
}
public class D40_AccessModifiers_Getters_Setters_Exercise {

	public static void main(String[] args) {
		MyCircle circle = new MyCircle();
		circle.setRadius(3);
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculatePerimeter());
	}

}
