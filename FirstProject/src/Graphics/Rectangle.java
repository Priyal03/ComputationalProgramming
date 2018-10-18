package Graphics;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(String color,double width,double height) {
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

	//Implement the abstract operation draw for Rectanlge
	public double area() {
		return width * height;
	}

	public void draw() {
		System.out.println("Draw a rectangle of width " + width + " height " + height);
		
	}
	
	public String toString() {
		return "Rectangle ("+width+","+height+")";
	}

}
