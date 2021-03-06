package Entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return this.height * this.width;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public double diagonal() {
		double d = Math.pow(width,2) + Math.pow(height,2);
		return Math.sqrt(d);
	}
	
	

}
