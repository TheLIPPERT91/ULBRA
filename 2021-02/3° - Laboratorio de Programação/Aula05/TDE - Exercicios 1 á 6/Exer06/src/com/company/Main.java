//6 - Crie uma classe que exiba o substring de uma string FRASE composto por todos os
// caracteres de FRASE exceto o último caracter.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String frase;
        int ultimo;
        Scanner tc= new Scanner(System.in);
        System.out.println("Dígite uma frase: ");
        frase= tc.nextLine();
        ultimo=frase.indexOf(" ");
        System.out.printf ("Primeiro nome extraído: \"%s\"%n", frase.substring(0, ultimo));
    }
}
