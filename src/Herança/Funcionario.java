
package Herança;

import java.util.Objects;


public class Funcionario {

    private String nome;
    private int codigo;
    private double salarioBase;

    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSalarioBase() {
        return (salarioBase);
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioLiquido() {
        double inss = salarioBase * 0.1;
        double ir = 0.0;
        if (salarioBase > 2000.0) {
            ir = (salarioBase - 2000.0) * 0.12;
        }
        return (salarioBase - inss - ir);
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "\n Codigo: " + getCodigo()
                + "\n Nome: " + getNome() + "\n Salario Base: " + getSalarioBase()
                + "\n Salario liquido: " + getSalarioLiquido());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    
}
