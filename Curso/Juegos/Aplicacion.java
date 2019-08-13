
package juego;

public class Aplicacion {
    public static void main(String[] args){
        JuegoAdivinaNumero juegoA = new JuegoAdivinaNumero(3,6);
        JuegoAdivinaPar juegoB = new JuegoAdivinaPar(3,6);
        JuegoAdivinaImpar juegoC = new JuegoAdivinaImpar(3,9);
        juegoA.juega();
        juegoB.juega();
        juegoC.juega();
    }
}
