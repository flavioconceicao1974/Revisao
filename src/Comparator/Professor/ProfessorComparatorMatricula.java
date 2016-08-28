
package Comparator.Professor;

import java.util.*;

public class ProfessorComparatorMatricula implements Comparator<Professor> {
    
    @Override
    public int compare(Professor prof1, Professor prof2) {
        
        if ( prof1.getMatricula() < prof2.getMatricula() ) 
            return -1;
        if ( prof1.getMatricula() > prof2.getMatricula() ) 
            return 1;
        return 0;
    }
}