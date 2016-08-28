
package Comparator.Professor;

import java.util.ArrayList;
import java.util.Collections;


public class App {
    public static void main(String[] args) {
        ArrayList<Professor> lista = new ArrayList<Professor>();
        
        Professor prof1 = new Professor("Tiago",2582,44);
        Professor prof2 = new Professor("Carlos",3582,36);
        Professor prof3 = new Professor("Aline",1582,38);
        Professor prof4 = new Professor("Fonseca",1532,28);
        Professor prof5 = new Professor("Heitor",1512,41);
        Professor prof6 = new Professor("Gonzales",1552,42);
        
        
        lista.add(prof1);
        lista.add(prof2);
        lista.add(prof3);
        lista.add(prof4);
        lista.add(prof5);
        lista.add(prof6);
        
        StaticExemplo.sort(lista, new ProfessorComparatorNomeAscendente());
        //StaticExemplo.imprime(lista,"Ordenados por nome ascendente:");
        
        StaticExemplo.sort(lista, new ProfessorComparatorNomeDescendente());
        //StaticExemplo.imprime(lista,"Ordenados por nome descendente:");
        
        
        StaticExemplo.sort(lista, new ProfessorComparatorMatricula());
        StaticExemplo.imprime(lista,"Ordenados por matrícula: ");
        
        StaticExemplo.sort(lista, new ProfessorComparatorCargaHoraria());
        StaticExemplo.imprime(lista,"Ordenados por CH ");
        
    }
    
    
}
