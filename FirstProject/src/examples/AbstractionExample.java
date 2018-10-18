package examples;

interface Drawable {
	public void draw();
}

abstract class Shape implements Drawable {
	// Define the common characteristics of shape
	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Define abstract operation draw
	public abstract double area();

	// This class also has an abstract method draw inherited from Drawable
	// interface
}

class Rectangle extends Shape {
	private double width;

	private double height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return width * height;
	}

	public void draw() {
		System.out.println("Draw a rectangle of width " + width + " height "
				+ height);

	}
}

class Circle extends Shape {
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
	
	public double area() {
		return Math.PI * radius * radius;
	}

	public void draw() {
		System.out.println("Draw a circle of radius " + radius);
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		Shape circle = new Circle("red",2.0);
		System.out.println("Area of Circle : " + circle.area());
		circle.draw();
		
		Shape rectangle = new Rectangle("green",2.0,3.0);
		System.out.println("Area of Rectangle : " + rectangle.area());
		rectangle.draw();
	}
}
