/*O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel
a ser negociado.A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior
valor entre o valor de transação (o valor negociado) e o valor venal de referência (fornecido pela Prefeitura).
Com base nisso, elabore uma classe que receba o valor da transação, o valor venal e o percentual de imposto.
Após isso, encontre o maior valor e aplique o percentual sobre ele.
Ao final, apresente o valor do imposto a ser pago. Observação: o valor do imposto a ser pago é calculado
por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para entrada e saída de dados utilize
a classe JOptionPane.
 */

package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double percentualItbi;
        double valVenal;
        double valTransacao;
        double impostoPago;
        String dado;

        dado= JOptionPane.showInputDialog("Dígite o valor da transação: ");
        valTransacao= Double.parseDouble(dado);
        dado= JOptionPane.showInputDialog("Dígite o valor venal: ");
        valVenal= Double.parseDouble(dado);
        dado= JOptionPane.showInputDialog("Dígite o porcentagem do imposto: ");
        percentualItbi= Double.parseDouble(dado);
        if (valTransacao > valVenal) {
            impostoPago=valTransacao*percentualItbi/100;
        }else{
            impostoPago=valVenal*percentualItbi/100;
        }

        JOptionPane.showMessageDialog(null, "Imposto a ser pago é: " + impostoPago);

    }
}
