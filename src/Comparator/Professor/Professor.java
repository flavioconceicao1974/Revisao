
package Comparator.Professor;

public class Professor {

    private String nome;
    private int matricula;
    private int cargaHoraria;

    public Professor(String n, int m, int c){

        nome = n; 
        matricula = m; 
        cargaHoraria = c;

    }   

    public void setMatricula(int m){ 
        matricula = m; 
    }

    public void setCargaHoraria(int c){ 
        cargaHoraria = c; 
    }

    public String getNome(){ 
        return nome; 
    }

    public int getMatricula(){ 
        return matricula; 
    }

    public int getCargaHoraria(){ 
        return cargaHoraria; 
    }

    public String toString(){

        return ("\nNome: "+nome+"\nMatrícula: "+matricula

                       +"\nCarga horária: "+cargaHoraria);

    }

}