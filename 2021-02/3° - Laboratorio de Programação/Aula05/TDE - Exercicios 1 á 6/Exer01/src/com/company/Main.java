//1 - Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6)
//por três vezes. Ao  final some seus valores e apresente o resultado das três jogadas.

package com.company;

public class Main {

    public static void main(String[] args) {
        final int FACES=6;
        final int VEZES=3;
        int sorteio, total=0;

        for (int i=0; i<VEZES; i++){
        sorteio = (int)(Math.random()*FACES+1);
        total+=sorteio;
        }
        System.out.println(total);
    }
}
