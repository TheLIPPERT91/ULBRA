//4 - Construa uma classe que receba uma frase qualquer e mostre essa
//frase de trás para a frente e sem espaços em branco
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase,invertido, resultado;
        Scanner tc = new Scanner(System.in);
        System.out.println("Dígite sua frase desejada: ");
        frase= tc.nextLine();
        invertido = new StringBuilder(frase).reverse().toString();
        resultado = invertido.replace(" ", "");
        System.out.println(resultado);
    }
}