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
public class JogoDaVelha {

    private char[][] tabuleiro;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' '; // vazio
            }
        }
    }

    public boolean set(int i, int j, char peca) {
        if (tabuleiro[i][j] != ' ')  
            return false; // posição já ocupada!
        tabuleiro[i][j] = peca;
        return true;
    }

    public char get(int i, int j) {
        return tabuleiro[i][j];
    }
    
    
    public String vencedor( ) {

        char mat[][] = tabuleiro;
        String resp = "Error";
        char c[] = {'O','O','X','X',};
        char elemento;
        int linhas = mat.length;
        int colunas = mat[0].length;
        if(linhas==colunas){
            resp = "Empate";
            for(int count=0;count<4;count++){
                for( int i=0;i<3;i++){
                    for( int j=0;j<3;j++){
                        if(count%2==0){
                            elemento = mat[i][j];
                        }else{
                            elemento = mat[j][i];
                        }
                        if( elemento != c[count]){
                            break;
                        }else{
                            if( j==2 ){
                                return "Vencedor "+c[count];
                            }
                        }
                    }
                }
            }
        }
        for(int count=0;count<4;count+=2){
            for( int i=0;i<3;i++){
                elemento = mat[i][i];
                if( elemento != c[count]){
                    break;
                }else{
                    if( i==2 ){
                        return "Vencedor "+c[count];
                    }
                }
            }
        }
        return resp;
    }

    @Override
    public String toString() {
        String txt = "";
        for( char[] linha : tabuleiro ){
            for( char celula : linha ){
                txt+= celula + " ";
            }
            txt+= "\n";
        }
        return txt ;
    }}
