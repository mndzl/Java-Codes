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
public class MovablePoint implements Movable {
   int x;
   int y;
   int xSpeed;
   int ySpeed;
   
   public MovablePoint(int x, int y, int xSpeed, int ySpeed){
       this.x = x;
       this.y = y;
       this.ySpeed = ySpeed;
       this.xSpeed = xSpeed;
   }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

   public void moveUp(){this.y-=ySpeed; }
   public void moveDown(){this.y+=ySpeed;}
   public void moveLeft(){this.x-=xSpeed;}
   public void moveRight(){this.x+=xSpeed;}
   
   @Override
   public String toString(){
       return "\nx: " + this.x + "\ny: " + this.y + "\nx Speed: " + this.xSpeed + "\ny Speed " + this.ySpeed;
   }
}
