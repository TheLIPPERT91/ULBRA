/*Faça uma classe que solicite login e senha, simulando o acesso a um sistema. Considere que os conteúdos de login e
senha originais são iguais a “java8”. O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos
originais. O usuário tem três chances para digitar corretamente os dados de login e senha. Para cada tentativa
incorreta deve aparecer uma mensagem alertando o erro e apresentando a quantidade de tentativas que ainda restam.
 */

        package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int usuarioAutorizado=1234;
        int senhaAutorizado=1234;
        int senhaInformado;
        int usuarioInformado;
        int cont=0;
        boolean logado=false;

        Scanner tc= new Scanner((System.in));
        do {

            System.out.println("Digite o usuário:");
            usuarioInformado= tc.nextInt();
            System.out.println("Digite a senha:");
            senhaInformado= tc.nextInt();

            cont++;
            if ((usuarioInformado==usuarioAutorizado)&& (senhaInformado==senhaAutorizado)){
                System.out.println("Login efetuado com sucesso! Numero de tentativas" +cont);
                logado=true;
            }else{
                System.out.println("Login errado! Numero de tentativa:" + cont);
            }
        }while ((cont<3) || (logado));
    }
}
