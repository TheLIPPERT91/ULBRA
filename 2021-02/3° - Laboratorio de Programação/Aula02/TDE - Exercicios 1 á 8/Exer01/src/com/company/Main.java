/* Usando a classe Scanner para entrada de dados, crie uma classe que receba o valor de um
produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto
com o desconto. Observação: o valor do desconto é calculado por meio da fórmula:
valor do desconto = valor do produto * percentual de desconto / 100.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double produto;
        Scanner tc= new Scanner(System.in);
        System.out.println("Dgíte o valor do produto desejado: R$");
        produto= tc.nextDouble();

        double desconto;
        System.out.println("Digíte em o valor do desconto concedido: ");
        desconto= tc.nextDouble();

        double total = produto*(1-desconto/100);
        System.out.println("O desconto total foi de: " + desconto + "%");
        System.out.println("Voçê pagará o total de: R$" +total);
    }
}
