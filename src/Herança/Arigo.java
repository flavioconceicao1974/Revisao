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
public class Arigo extends Funcionario {

    public Arigo(int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
    }
    
    public double getSalarioLiquido() {
        return super.getSalarioLiquido()+super.getSalarioBase()*0.05;
    }
    
}
