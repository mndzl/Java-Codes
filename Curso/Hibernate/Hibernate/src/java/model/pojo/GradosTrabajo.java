package model.pojo;
// Generated 21/11/2019 19:32:45 by Hibernate Tools 4.3.1



/**
 * GradosTrabajo generated by hbm2java
 */
public class GradosTrabajo  implements java.io.Serializable {


     private char grado;
     private float sueldoMinimo;
     private float sueldoMaximo;

    public GradosTrabajo() {
    }

    public GradosTrabajo(char grado, float sueldoMinimo, float sueldoMaximo) {
       this.grado = grado;
       this.sueldoMinimo = sueldoMinimo;
       this.sueldoMaximo = sueldoMaximo;
    }
   
    public char getGrado() {
        return this.grado;
    }
    
    public void setGrado(char grado) {
        this.grado = grado;
    }
    public float getSueldoMinimo() {
        return this.sueldoMinimo;
    }
    
    public void setSueldoMinimo(float sueldoMinimo) {
        this.sueldoMinimo = sueldoMinimo;
    }
    public float getSueldoMaximo() {
        return this.sueldoMaximo;
    }
    
    public void setSueldoMaximo(float sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }




}


