
package EjercicioFraccion;

public class Fraccion {
    private int numerador, denominador;
    Fraccion(int num,int den)throws FraccionException{
        if(den==0)throw new FraccionException("No se permiten fracciones con denominador cero.");
        this.numerador = num;
        this.denominador = den;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccion suma(Fraccion b){
        int d = this.denominador * b.denominador;
        int n1 = d/this.denominador * this.numerador;
        int n2 = d/b.denominador * b.numerador;
        return new Fraccion(n1+n2,d);
    }
    
    public Fraccion multiplicar(Fraccion b){
        int num = this.numerador * b.numerador;
        int den = this.denominador * this.denominador;
        return new Fraccion(num,den);
    }
    
    public Fraccion restar(Fraccion b){
        int d = this.denominador * b.denominador;
        int n1 = d/this.denominador * this.numerador;
        int n2 = d/b.denominador * b.numerador;
        return new Fraccion(n1-n2,d);
    }
    
    public Fraccion dividir(Fraccion b){
        int num = b.denominador;
        int den = b.numerador;
        return multiplicar(new Fraccion(num,den));
    }
}
