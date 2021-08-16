/*Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se aposentar por idade,
as mulheres precisam ter atingido 60 anos de idade e os homens, 65. Já na aposentadoria por tempo de
contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens. Com base
nessas informações, elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade de anos
de contribuição. A seguir, calcule a quantidade de anos que falta de contribuição para se aposentar, ou
então emita a mensagem: “você já tem o direito a aposentadoria”.
 */

package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int idade;
        char sexo;
        char f;
        char m;
        int contribuicao;
        String leitura;
        int tempoRestante;

        leitura= JOptionPane.showInputDialog("Dígite sua idade: ");
        idade= Integer.parseInt(leitura);
        leitura= JOptionPane.showInputDialog("Dígite o seu tempo de contribuição: ");
        contribuicao= Integer.parseInt(leitura);
        leitura= JOptionPane.showInputDialog("Digite seu sexo: \nF=> Feminino \nM=> Masculino");
        sexo= leitura.charAt(0);

        switch(sexo){

            case 'F':
                    if (idade>=60 || contribuicao>=30){
                        System.out.println("você já tem o direito a aposentadoria!");
                    }else if (idade<60 || contribuicao<30){
                        tempoRestante=30-contribuicao;
                        System.out.println("Ainda faltam " +tempoRestante+" anos para se aposentar!");
            }break;

            case 'M':
                if (idade>=65 || contribuicao>=35){
                    System.out.println("você já tem o direito a aposentadoria!");
                }else if (idade<65 || contribuicao<30){
                    tempoRestante=35-contribuicao;
                    System.out.println("Ainda faltam " +tempoRestante+" anos para se aposentar!");
            }break;

            default:
                System.out.println("Indefinido");
                break;
        }

    }
}
