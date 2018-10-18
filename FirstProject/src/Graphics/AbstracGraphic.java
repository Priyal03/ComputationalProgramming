package Graphics;

public class AbstracGraphic {

	public static void main(String args[]){
		
		Shape circle = new Circle("blue", 5);
		
		circle.draw();
		System.out.println("Area is : "+circle.area()+"\nString : "+circle.toString());
		
		circle.setShape("red");
		
		((Circle)circle).setRadius(3);
		
		circle.area();
	}
}

//Shape is super
//Circle is sub
//if we give reference of super then that methods only we can inherit
//if we give of circle then all the methods along super class