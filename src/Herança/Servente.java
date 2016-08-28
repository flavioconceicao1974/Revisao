package Herança;

/**
 * Servente: classe derivada da classe Funcionario. Um servente 
 * recebe um adicional de 5% a título de insalubridade.
 * 
 */
public class Servente extends Funcionario {

    public Servente(int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
    }
    
    @Override
    public double getSalarioLiquido() {
        return super.getSalarioLiquido() + (super.getSalarioBase()*0.05);
    }
    
}
