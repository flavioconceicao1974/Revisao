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
public class TestaException1 {

    public static void main(String[] args) {
        
        ManipulaString mp = new ManipulaString("Flavio");
        int i = 7;
        try {
            System.out.println("Teste " + mp.getLetra(i));
        } catch (InvalidIndexException  e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.testa());
            System.out.println("Tente novamente");
        } finally {
            System.out.println("Esse trecho sempre é executado!!");
        }

    }
}
