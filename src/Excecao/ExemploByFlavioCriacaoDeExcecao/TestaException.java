/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao.ExemploByFlavioCriacaoDeExcecao;

/**
 *
 * @author flavio-silva
 */
public class TestaException {

    public static void main(String[] args) {
        try {
            String s = "Flavio";
            System.out.println("Teste " + s.charAt(15));
        } catch (IndexOutOfBoundsException  e) {
            System.out.println(e.getMessage());
            System.out.println("Tente novamente");
        } finally {
            System.out.println("Esse trecho sempre é executado!!");
        }

    }
}
