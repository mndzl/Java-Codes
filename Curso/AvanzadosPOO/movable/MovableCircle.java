/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Alumno
 */
public class MovableCircle implements Movable{
    private int radius;
    MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return "Radius: " + this.radius + "\nCenter: " + center;
    }
    
    public int getRadius(){
        return this.radius;
    }
    public MovablePoint getCenter(){
        return this.center;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setCenter(MovablePoint center){
        this.center = center;
    }
    
   public void moveUp(){center.moveUp();}
   public void moveDown(){center.moveDown();}
   public void moveLeft(){center.moveLeft();}
   public void moveRight(){center.moveRight();}
}
