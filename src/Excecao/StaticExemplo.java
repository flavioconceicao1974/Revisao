/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao;

/**
 *
 * @author flavio-silva
 */
public class StaticExemplo {

    public static double fatorial(int x) {

        if (x < 0) {
            throw new IllegalArgumentException("x deve ser >= 0");
        } else if (x > 100) {
            throw new ArithmeticException("Valor muito grande");
        } else {
            double fact;
            for (fact = 1.0; x > 1; x--) {
                fact = fact * x;
            }
            return (fact);
        }
    }

}
