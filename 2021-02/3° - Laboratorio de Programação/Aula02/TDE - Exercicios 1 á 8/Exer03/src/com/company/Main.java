/*Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de duas provas e de um
trabalho. Calcule e mostre a média e o resultado final (aprovado ou reprovado). Para calcular a média utilize a
fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3. Considere que a média mínima
para aprovação é 6.
 */

package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

	    float prova1;
	    float prova2;
	    float trabalho;
	    float media;
	    String leitura;

	    leitura = JOptionPane.showInputDialog("Dígite a nota da prova 1:");
	    prova1= Float.parseFloat(leitura);
        leitura = JOptionPane.showInputDialog("Dígite a nota da prova 2:");
        prova2= Float.parseFloat(leitura);
        leitura = JOptionPane.showInputDialog("Dígite a nota do trabalho:");
        trabalho= Float.parseFloat(leitura);

        media=(prova1+prova2+trabalho)/3;
        System.out.println("A sua média é: " +media);
        if(media>=6){
            System.out.println("Aprovado!");
        }if(media<6){
            System.out.println("Reprovado!");
        }
    }
}
