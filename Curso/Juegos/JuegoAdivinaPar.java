
package juego;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

    public JuegoAdivinaPar(int maxVidas, int nObjetivo) {
        super(maxVidas, nObjetivo);
    }
    @Override
    boolean ValidaNumero(int n){
        if(n%2==0){
            return true;
        }else{
            System.out.println("Numero no valido, solo pares permitidos.");
            return false;
        }
    }
}
