
package Comparator.Professor;

import java.util.*;

public class ProfessorComparatorNomeAscendente implements Comparator<Professor> {
    
    @Override
    public int compare(Professor prof1, Professor prof2) {
        
        Professor p1 = prof1;
        Professor p2 = prof2;

        return( p1.getNome().compareTo(p2.getNome()) );
    }

}