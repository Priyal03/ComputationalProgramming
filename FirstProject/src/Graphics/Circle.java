package Graphics;
import java.awt.Color;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Implement the abstract operation draw for Circle
	public double area() {
		return Math.PI * radius * radius;
	}

	public void draw() {
		System.out.println("Draw a circle of radius " + radius);
	}
	
	public String toString() {
		return "Circle("+radius+")";
	}
}
