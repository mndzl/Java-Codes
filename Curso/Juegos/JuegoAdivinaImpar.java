
package juego;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

    public JuegoAdivinaImpar(int maxVidas, int nObjetivo) {
        super(maxVidas, nObjetivo);
    }
       @Override
    boolean ValidaNumero(int n){
        if(n%2!=0){
            return true;
        }else{
            System.out.println("Numero no valido, solo impares permitidos.");
            return false;
        }
    }
}
