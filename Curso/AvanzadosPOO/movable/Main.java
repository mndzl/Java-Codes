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
public class Main {
    public static void main(String[] args){
        MovableCircle a = new MovableCircle(12,5,2,2,9);
        System.out.println(a);
        a.moveRight();
        System.out.println(a);
    }
}
