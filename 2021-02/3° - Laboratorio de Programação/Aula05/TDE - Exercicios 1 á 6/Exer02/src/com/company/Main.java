/*2 - Uma farmácia precisa ajustar os preços de seus produtos em 12%. Elabore uma classe que
receba o valor do produto e aplique o percentual de acréscimo. O novo valor a ser calculado
deve ser arredondado para mais ou para menos usando o método round. A classe deve também conter
um laço de repetição que encerre o programa quando o usuário fornecer o valor zero (0) para o valor
do produto. Dessa forma, o usuário digita o valor do produto, a classe calcula e mostra o valor com
acréscimo, a seguir solicita um novo valor. Esse processo continua enquanto o valor do produto for
diferente de zero; caso contrário o programa será encerrado*/
package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String nomeProduto;
        double valorProduto;
        final double PERCENTUAL=1.12;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.00");
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Valor do produto: ");
            valorProduto= tc.nextDouble();
            if (valorProduto>0){
                System.out.println("Nome do produto: ");
                nomeProduto= tc.next();
                valorProduto= valorProduto*PERCENTUAL;
                System.out.println("O produto: " +nomeProduto);
                System.out.println("Novo preço: R$" + df.format(Math.round(valorProduto)));
            }else{
                System.out.println("Obrigado!");
            }
        }while (valorProduto!=0);
    }
}