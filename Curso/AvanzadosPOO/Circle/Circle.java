
package Circle;

public class Circle {
    private double radius;
    private static final double RADIUS_DEF = 1.0d;
    Circle(double radius){
        this.radius = radius;
    }
    Circle(){
        this.radius = RADIUS_DEF;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double r){
        this.radius = r;
    }
    double getArea(){
        return Math.PI * (this.radius * this.radius); 
    }
    double getCircumference(){
        return 2 *Math.PI * this.radius;
    }
    @Override
    public String toString(){
        return "Radius: " + this.radius;
    }
}
