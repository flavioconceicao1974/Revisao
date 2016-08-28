
package Array;

/**
 *
 * @author flavio-silva
 */
public class Matriz {

    private static int count = 0;
    
    
    
    public static void main(String[] args) {

        int[][] matriz = {{4,1,2},
                          {0,4,2},
                          {0,1,4}};
        
        System.out.println("Soma "+ getSomaDiagonal2(matriz));
        
        
        
    }
    
    
    public static int getSomaDiagonal(int mat[][]) {
        int linhas = mat.length;
        int colunas = mat[0].length;
        int soma = 0;
        
        if (linhas == colunas) {         
            for(int i=0; i<linhas; i++)
                soma += mat[i][i]; // soma = soma +
        }        
        
        return soma;
    }
    
    public static int getSomaDiagonal2(int mat[][]) {
        int linhas = mat.length;
        int colunas = mat[0].length;
        int soma = 0;
        
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if(i==j){
                    soma+=mat[i][j];
                }
            }
        }
        return soma;
    }
    
    }
