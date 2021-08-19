/*Na área da eletrônica, em um circuito em série temos que a resistência equivalente (total) desse circuito é obtida
mediante a soma de todas as resistências existentes (RE = r1 + r2 + ... + rn). Faça uma classe que receba o valor de
quatro resistências ligadas em série, calcule e mostre a resistência equivalente, a maior e a menor resistência.
 */

package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    int re1;
		int re2;
		int re3;
		int re4;
		int reTotal;

		Scanner tc= new Scanner(System.in);
		System.out.println("Dígite a sua resistencia 1: ");
		re1= tc.nextInt();
		System.out.println("Dígite a sua resistencia 2: ");
		re2= tc.nextInt();
		System.out.println("Dígite a sua resistencia 3: ");
		re3= tc.nextInt();
		System.out.println("Dígite a sua resistencia 4: ");
		re4= tc.nextInt();

 		reTotal=re1+re2+re3+re4;
		System.out.println("A sua resistencia total é de : " +reTotal);

		if (re1<re2 && re1<re3 && re1<re4){
			System.out.println("A menor resistencia é: " +re1);
		}else if(re1>re2 && re1>re3 && re1>re4){
			System.out.println("A maior resistencia é: " +re1);
		}

		if (re2<re1 && re2<re3 && re2<re4){
			System.out.println("A menor resistencia é: " +re2);
		}else if(re2>re1 && re2>re3 && re2>re4){
			System.out.println("A maior resistencia é: " +re2);
		}

		if (re3<re1 && re3<re2 && re3<re4){
			System.out.println("A menor resistencia é: " +re3);
		}else if(re3>re1 && re3>re2 && re3>re4){
			System.out.println("A maior resistencia é: " +re3);
		}

		if (re4<re1 && re4<re2 && re4<re3){
			System.out.println("A menor resistencia é: " +re4);
		}else if(re4>re1 && re4>re2 && re4>re3){
			System.out.println("A maior resistencia é: " +re4);
		}

    }
}
