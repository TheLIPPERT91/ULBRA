//12- A gravidade da Lua é cerca de 17% a da Terra. Crie um programa que calcule seu peso na Lua.
//Peso * 0,17 = PesoLua (peso na Lua)
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Qual seu peso na terra em Kg?");
        Scanner teclado = new Scanner(System.in);
        int PesoTerra = Integer.parseInt(teclado.nextLine());
        System.out.println("O seu peso na lua será de: " + PesoTerra*0.17 + "kg");
    }
}
