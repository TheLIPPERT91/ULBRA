/*5 - Elabore uma classe que receba uma frase e verique que se essa frase possui palavras
impróprias. As palavras impróprias são: sexo e sexual. Caso encontre uma dessas palavras,
emita em tela a mensagem “conteúdo impróprio”, caso contrário “conteúdo liberado”*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 String frase;

     Scanner tc = new Scanner(System.in);
     System.out.println("Dígite sua frase desejada: ");
     frase= tc.nextLine();
     if (frase.contains("sexo")==true || frase.contains("sexual")==true){
         System.out.println("Conteúdo impróprio");
     }else{
         System.out.println("Conteúdo liberado!");
     }
    }
}
