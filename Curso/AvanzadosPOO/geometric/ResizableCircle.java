/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric;

/**
 *
 * @author Alumno
 */
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    public void resize(int percent){
        super.radius *= percent/100;
    }
}
