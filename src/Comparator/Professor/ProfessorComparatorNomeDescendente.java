
package Comparator.Professor;

import java.util.*;

public class ProfessorComparatorNomeDescendente implements Comparator<Professor> {
    
    @Override
    public int compare(Professor prof1, Professor prof2) {
        
        Professor p1 = prof1;
        Professor p2 = prof2;

        return( p2.getNome().compareTo(p1.getNome()) );
        //return inverteSinal( p1.getNome().compareTo(p2.getNome()) );
    }
    
    public int inverteSinal( int x ){
        if( x < 0 )
            return Math.abs(x); // deixando x positivo
        else if ( x > 0 )
            x -=  ( 2*x );      // deixando x positivo
        return x;
    }
}