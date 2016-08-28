package Herança;

/*
 * Motorista: classe derivada da classe Funcionario. Para cada 
 * motorista é necessário armazenar o número da carteira de 
 * motorista.
 */

public class Motorista extends Funcionario {
    private String numCarteira;

    public Motorista(String numCarteira, int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
        this.numCarteira = numCarteira;
    }

    public String getNumCarteira() {
        return numCarteira;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Numero carteira: " + numCarteira;
    }
}
