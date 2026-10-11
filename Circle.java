package Interfaces;

public class Circle implements Colorful {
	
	private double radius;
	

	public Circle(double radius) {
	
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("It is draw");
	}

	@Override
	public void calculateArea() {
		System.out.println(Math.PI*radius*radius);
		
	}

	@Override
	public void fillColor() {
		System.out.println("It is blue color");
		
	}
	

}
