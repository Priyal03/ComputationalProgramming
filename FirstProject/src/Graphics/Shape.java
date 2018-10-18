package Graphics;
import java.awt.Color;

public abstract class Shape implements Drawable {
	
	protected String color;

	public Shape(String Color){
		this.color=color;
	}
	
	public void setShape(String color){
		this.color=color;
	}
	
	public String getShape(){
		return color;
	}
	
	public abstract double area(); 
	//the method with interface
}
