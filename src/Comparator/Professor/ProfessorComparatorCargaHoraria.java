
package Comparator.Professor;

import java.util.*;

public class ProfessorComparatorCargaHoraria implements Comparator<Professor> {
    
    @Override
    public int compare(Professor prof1, Professor prof2) {
        
        // maneira mais otimizada e "INTELIGENTE" de implementar esta rotina!!!
        
        return( prof1.getCargaHoraria() - prof2.getCargaHoraria());
        
        
/*        
        if ( prof1.getCargaHoraria() < prof2.getCargaHoraria() ) 
            return -1;
        if ( prof1.getCargaHoraria() > prof2.getCargaHoraria() ) 
            return 1;
        return 0;
 * 
 */
    }
}