/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança;

/**
 *
 * @author flavio-silva
 */
public class App2 {
    public static void main(String[] args) {
        Funcionario ari = new Arigo(100, "Flavio Conceicao", 100.00);
        // Arigo ari = new Arigo(100, "Flavio Conceicao", 100.00);
        System.out.println("Arigó : "+ari);
        System.out.println("Nome : "+ari.getNome());
    }
    
}
