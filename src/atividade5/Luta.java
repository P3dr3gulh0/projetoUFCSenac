package atividade5;

import java.util.Random;
import java.util.Scanner;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada    ;

    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        Scanner scan = new Scanner(System.in);

        System.out.println(desafiado.getNome()+"\n"+desafiante.getNome());
        

        if (desafiante.getCategoria() == desafiado.getCategoria() && desafiante.getNome() != desafiado.getNome()) {
            setAprovada(true);
            System.out.println("Luta Aprovada");
            lutar(desafiante, desafiado);
        } else {
            System.out.println("Luta Reprovada");
            setAprovada(false);
        }

        this.desafiante = desafiante;
        this.desafiado = desafiado;
    }

    public void lutar(Lutador desafiante, Lutador desafiado) {
        Random random = new Random();
        
        int pontsDesafiante = 0;
        int pontsDesafiado = 0;
        int rounds = 3;
        if (isAprovada() == true) {
            for (int i = 1; i <= rounds; i++) {
                System.out.println(i + "º Round!");
                int dadoDesafiante = random.nextInt(1,6);
                int dadoDesafiado = random.nextInt(1,6);
                if (dadoDesafiante > dadoDesafiado) {
                    System.out.println("O vencedor é: " + desafiante.getNome());
                    pontsDesafiante++;
                } else if (dadoDesafiante < dadoDesafiado) {
                    System.out.println("O vencedor é: " + desafiado.getNome());
                    pontsDesafiado++;
                } else {
                    rounds++;
                    System.out.println("Empate! Começando um novo round");
                }
            }
            if (pontsDesafiante > pontsDesafiado) {
                System.out.println("O vencedor da Luta é: " + desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
            } else{
                System.out.println("O vencedor da Luta é: " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
            }
        }

    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {

        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
