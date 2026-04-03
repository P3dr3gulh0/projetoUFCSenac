package atividade5;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        Lutador lutador1 = new Lutador("Cleiton", "Grecia", random.nextInt(1,100), random.nextInt(1,100), random.nextInt(50,110));
        Lutador lutador2 = new Lutador("Jeus", "Olimpo", random.nextInt(1,100), random.nextInt(1,100), random.nextInt(50,110));
        
        Luta luta1 = new Luta();
        
        lutador1.apresentar();
        lutador2.apresentar();
        
        luta1.marcarLuta(lutador1, lutador2);
        
    }
        
}
