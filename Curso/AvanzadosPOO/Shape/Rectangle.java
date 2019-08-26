package Shape;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle(){super();}
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	public double getPerimeter() {
		return this.width*2 + this.length*2;
	}

	public String toString() {
		return "Color: " + super.getColor() + "\nFilled: " + super.isFilled() +  "\nWidth: " + this.width + "\nLength: " + this.length;
	}
}
