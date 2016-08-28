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
public class InvalidIndexException extends Exception{


    private int indice, tamanho;

    public InvalidIndexException(int n, int t) {
        super("Indice de acesso a string invalido: " + n + " > " + t);
        indice = n;
        tamanho = t;
    }

    public String testa(){
        return "Xiii deu problema";
    }
    
    
    public String toString() {
        return "Indice inválido: " + indice + " Tamanho maximo: "
                + tamanho;
    }

      
    

}
