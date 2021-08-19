/*Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário fornece o
número desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numero=0;
	int multiplicador=0;

        Scanner tc= new Scanner(System.in);
        System.out.println("Dígite o numero desejado: ");
        numero= tc.nextInt();

        System.out.println("TABUADA DO: "+ numero);
        for(multiplicador=0; multiplicador<=10; multiplicador++){

            System.out.println(numero + "X" + multiplicador + "=" +numero*multiplicador);
        }
    }
}
