/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao;

import java.util.Scanner;

/**
 *
 * @author flavio-silva
 */
public class ExcecaoTratada {

    public static void main(String[] args) {
        int continua = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite o valor para o calculo:");
            int x = sc.nextInt();
            try {
                double result = StaticExemplo.fatorial(x);
                System.out.println("Fatorial de " + x + " = " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Valor negativo inv. p/calculo do fatorial");
                System.out.println("Tente novamente");
            } catch (ArithmeticException e) {
                System.out.println("Valor muito grande p/calculo do fatorial");
                System.out.println("Tente novamente");

            }
            System.out.println("Digite 0 p/cont ou qq outro nro para parar");
            continua = sc.nextInt();
        } while (continua == 0);
        System.out.println("Fim");

    }

}
