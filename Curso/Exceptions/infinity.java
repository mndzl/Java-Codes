/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinity;

/**
 *
 * @author Alumno
 */
public class Infinity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           double a = 12;
           double b = 0;
       
           if(a/b == Double.POSITIVE_INFINITY)
               throw new InfinityException();
       }catch(InfinityException e){
           e.printStackTrace();s
       }
       
    }
    
}
