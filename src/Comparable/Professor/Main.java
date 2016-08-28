
package Comparable.Professor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Professor> lista = new ArrayList<Professor>(4);
        
        lista.add( new Professor("Carlos",50,50) );
        lista.add( new Professor("Marcos",20,20) );
        lista.add( new Professor("José",30,30) );
        lista.add( new Professor("André",60,60) );
        
        System.out.println("Antes de Ordenado");
        StaticExemplo.imprime(lista);
        
        ArrayList<Professor> lista1 = (ArrayList<Professor>)lista.clone();
        //Collections.sort(lista1);
        StaticExemplo.sort(lista1);
        
        System.out.println("\n\nDepois de Ordenado");
        StaticExemplo.imprime(lista1);
        
    }
}
