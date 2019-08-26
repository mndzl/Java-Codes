package Shape;

public class Square extends Rectangle {
	Square(){super();}
	Square(double side){
		super(side,side);
	}
	Square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return super.getLength();
	}
	public void setSide(double side) {
		super.length = side;
		super.width = side;
	}
	public void setWidth(double width) {
		super.setWidth(width);
	}
	public void setLength(double length) {
		super.setLength(length);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
