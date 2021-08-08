/*13 - Faça um programa que calcula a que distância, em pés, um ouvinte está da queda de um relâmpago. O som viaja a
 aproximadamente 1.100 pés por segundo pelo ar. Logo, conhecer o intervalo entre o momento em que você viu um
 relâmpago e o momento em que o som o alcançou lhe permitirá calcular a distância do relâmpago.
 Para este projeto, considere que o intervalo seja de 7,2 segundos.*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Qual a velocidade do som, por segundo? ");
        Scanner som = new Scanner(System.in);
        double Som = som.nextDouble();
        //==============================================================================================================
        System.out.println("Qual intervalo, em segundos, entre o ouvinte e o relâmpago?");
        Scanner intervalo = new Scanner(System.in);
        double Intervalo = intervalo.nextDouble();
        //==============================================================================================================
        System.out.println("A Distância entre o ouvinte e a queda do relâmpago é de: " + Som*Intervalo + " Pés!");
    }
}
