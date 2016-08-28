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
public abstract class Animal {
    private String nome;
    private int idade;
    
    public Animal( String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public abstract String emiteSom();
    
    @Override
    public String toString(){
        return ("Nome: "+this.getNome()+" - Idade : "+this.getIdade());
    }
    
}
