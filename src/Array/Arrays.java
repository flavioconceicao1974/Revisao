
package Array;

/**
 *
 * @author flavio-silva
 */
public class Arrays {

    private static int count = 0;
    
      
    
    
    /**
     * Método Testador
     * @param 
     * @return 
     */
    
    public static void main(String[] args) {
        
        /*
        
        int primos[] = {1,3,5,7,11,13,17,19,23 };
        int[] outros = primos;
        primos[1] = 4;
        
        for(int i=0;i<outros.length;i++){
            System.out.println(outros[i]);
        }
        
        
        int teste[] = {1,3,5,7,11,13,17,19,23 };
        */
        
        int teste[] = {1,2,4,6,8,10,12,14,16};
        
        /*
        int primos[] = {1,3,5 };
        
        if( temParProdutoImpar(teste)){
            System.out.println("temParProdutoImpar");
        }
        System.out.println("Quantidade de Iterações :"+count);
        
        int array3[] = getUniao2( teste, primos );
        
        System.out.println( toString( array3 ) );
        */
        
        int array3[] = getInverteOrdem( teste );
        System.out.println( toString( array3 ) );
    }
    
    /**
     * 1) Apresente a implementação de um método que verifica se
     * todos os números de um array de inteiros recebido por
     * parâmetro são diferentes uns dos outros (em outras
     * palavras, se o array contém elementos distintos). 
     */
    private static boolean temElementosDistintosFlavio(int [] array){
        
        for( int i=0;i<array.length;i++){
            for( int j=0;j<array.length;j++){
                count++;
                if( array[i]==array[j] && i!=j){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean temElementosDistintos(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                count++;
                if (array[i]==array[j])
                    return false;
            }
            
        }
        return true;
    } 
    
    public static boolean temParProdutoImpar(int [] array){
        
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                count++;
                if((array[i] * array[j])%2 != 0)
                    return true;
            }
            
        }
        return false;
    }

    public static int[] getUniao(int [] array1, int [] array2){
        int qtdeNovo = array1.length+array2.length;
        int array3[] = new int[qtdeNovo];
        int aux = 0;
        for( int i=0;i<array1.length;i++){
            array3[aux++]= array1[i];
        }
        for( int i=0;i<array2.length;i++){
            array3[aux++]= array2[i];
        }
        return array3;
    }
    
    public static int[] getUniao2(int [] array1, int [] array2){
        int qtdeNovo = array1.length+array2.length;
        int array3[] = new int[qtdeNovo];
        int maxArray1 = 0;
        int maxArray2 = 0;
        int aux = 0;
        while( aux < qtdeNovo ){
            if( maxArray1 < array1.length){
                array3[aux++]= array1[maxArray1++];
            }
            if( maxArray2 < array2.length){
                array3[aux++]= array2[maxArray2++];
            }
        }
        return array3;
    }
    
    public static int[] getCopiaOrdenada(int [] array){
        
        int arrayNovo[] = array.clone();
        int maior = 0;
        
        for (int i=0; i<arrayNovo.length; i++) {
            maior = i;
            for (int j=i+1; j<arrayNovo.length; j++) {
                count++;
                if( arrayNovo[j] > arrayNovo[maior] ){
                    maior = j;
                }
            }
            int aux = arrayNovo[i];
            arrayNovo[i] = arrayNovo[maior];
            arrayNovo[maior] = aux;
        }
        return arrayNovo;
    }
    
    public static int[] getInverteOrdem(int [] array){
        
        int arrayNovo[] = array.clone();
        int qtElementos = arrayNovo.length;
        
        for (int i=0; i<qtElementos/2; i++) {
            int aux = arrayNovo[i];
            arrayNovo[i] = arrayNovo[qtElementos-1-i];
            arrayNovo[qtElementos-1-i] = aux;
        }
        return arrayNovo;
    }
    
    
    public static String toString( int[] array ){
        String str = "";
        for( int i : array ){
            str += i+" - ";
        }
        return str;
    }
    
}
