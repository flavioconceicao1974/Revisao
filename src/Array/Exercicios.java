/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author flavio-silva
 */
public class Exercicios {
    private boolean temElementosDistintos(int [] array){
        
        for( int i=0;i<array.length;i++){
            for( int j=0;j<array.length;j++){
                if( array[i]==array[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
// esses comentários no final
