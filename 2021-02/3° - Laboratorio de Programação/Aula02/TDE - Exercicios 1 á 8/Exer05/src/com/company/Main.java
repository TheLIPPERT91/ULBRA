/*Elabore uma classe que receba o nome de um produto e o seu valor. O desconto deve ser calculado
de acordo com o valor fornecido conforme a imagem. Utilizando a estrutura if-else, apresenta em tela
o nome do produto, valor original do produto e o novo valor depois de ser realizado o desconto.
Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
             VALOR EM R$        DESCONTO %
             >=50 e <200          5
             >=200 e <500         6
             >=500 e <1000         7
             >=100                8
 */

package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String produto;
        int valor=0;
        double desconto;
        String leitura;
        double total;

        leitura = JOptionPane.showInputDialog("Digite o nome do produto");
        produto = leitura;
        leitura = JOptionPane.showInputDialog("Digite o valor do produto em R$");
        valor = Integer.parseInt(leitura);

        if (valor >= 50 && valor < 200) {
            desconto = (valor * 5) / 100;
            total = valor - desconto;
            System.out.println("O valor do " + produto + " era de: R$" + valor);
            System.out.println("O total a ser pago será de: R$ " + total + "\nCom desconto de: 5%");
        }else if (valor >= 200 && valor < 500) {
            desconto = (valor * 6) / 100;
            total = valor - desconto;
            System.out.println("O valor do " + produto + " era de: R$" + valor);
            System.out.println("O total a ser pago será de: R$ " + total + "\nCom desconto de: 6%");
        }else if (valor >= 500 && valor < 1000) {
            desconto = (valor * 7) / 100;
            total = valor - desconto;
            System.out.println("O valor do " + produto + " era de: R$" + valor);
            System.out.println("O total a ser pago será de: R$ " + total + "\nCom desconto de: 7%");
        }else if (valor >= 1000) {
            desconto = (valor * 8) / 100;
            total = valor - desconto;
            System.out.println("O valor do " + produto + " era de: R$" + valor);
            System.out.println("O total a ser pago será de: R$ " + total + "\nCom desconto de: 8%");
        }else if (valor >= 0 && valor < 50) {
            System.out.println("O valor do " + produto + " será de: R$" + valor);
        }else if(valor<0){
            System.out.println("VALOR INCORRETO!");
        }else;
    }
}
