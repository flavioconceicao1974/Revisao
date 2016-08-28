 
package Comparable.Professor;

public class Professor implements Comparable{
    private String nome;
    private int matricula;
    private int cargaHoraria;
    
    public Professor(String n, int m, int c){
        nome = n; 
        matricula = m; 
        cargaHoraria = c;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public String toString(){
        return ("Nome: "+nome+"\nMatrícula: "
                        +matricula+"\nCarga horária: "
                        +cargaHoraria);
    }

    @Override
    public int compareTo(Object o) {
        if(!( o instanceof Professor))
            return 0;
        //return nome.compareTo(((Professor)o).getNome());
        return this.getMatricula()-((Professor)o).getMatricula();
    }
}
