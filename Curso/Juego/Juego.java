package Juego;
import java.util.Scanner;

public abstract class Juego{
Scanner scanner = new Scanner(System.in);
    protected int vidas;
     abstract void juega();
     abstract void ReiniciaPartida();
     abstract boolean QuitaVida();
}
