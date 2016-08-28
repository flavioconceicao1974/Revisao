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
public class ExcecaoLancadaEPegadaPeloProgramador {

    
    
    public static double divide(int a, int b) {
        if( b == 0 ){
            throw new ArithmeticException("O divisor não pode ser ZERO!!!");
        }
        double resp = a / b; // se b == 0 lança ArithmeticException
        return (resp);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try{
            double result = divide(n1, n2);
            System.out.println("Resultado: " + result);
        }catch( ArithmeticException e ) {
            System.out.println(e.getMessage());
        }
    }

}
