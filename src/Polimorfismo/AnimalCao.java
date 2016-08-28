/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author flavio-silva
 */
public class AnimalCao extends Animal{

    public AnimalCao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emiteSom() {
        return "Au, Au";
    }
    
}
