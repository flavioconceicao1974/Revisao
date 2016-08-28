package HerançaEntrePacotes;

import Herança.*;

/**
 *
 * MestreDeObras: classe derivada da classe Servente. Para 
 * cada mestre de obras é necessário armazenar quantos 
 * funcionarios estão sob sua supervisão. Um mestre de 
 * obras ganha um adicional de 10% para cada grupo de 10 
 * funcionários que estão sob seu comando.
 */

public class MestreDeObras extends Servente {
    
    private int totalFuncionarios;
          
    public MestreDeObras(int codigo, String nome, double salarioBase, int totalFuncionarios) {
        super(codigo, nome, salarioBase);
        setTotalFuncionarios(totalFuncionarios);
    }

    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        if (totalFuncionarios<0)
            totalFuncionarios = 0;
        this.totalFuncionarios = totalFuncionarios;
    }

        
    @Override
    public double getSalarioLiquido() {
        double adicional = (totalFuncionarios/10) * 0.1 * super.getSalarioBase();
        return super.getSalarioLiquido() + adicional;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Total de funcionarios: " + totalFuncionarios;
    }
            
}
