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
public class ManipulaString {
    
    private String s;
    
    public ManipulaString( String s ){
        this.s = s;
    }
    
    public char getLetra(int i ) throws InvalidIndexException {
        if (i > s.length()) {
            throw new InvalidIndexException(i,s.length());
        }
        return s.charAt(i);
    }
    
    
}
