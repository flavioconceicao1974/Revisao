/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.exemploSalario;

/**
 *
 * @author flavio-silva
 */
public class TesteInterfacePolimorfismo {

    public static void main(String args[]) {
        Salario ref1, ref2;
        ref1 = new Professor("Beltrano", 22222, 20, (float) 20.5);
        ref2 = new MotoristaTaxi("Fulano", 123456, 8745, "30/08/2008",
                3028, 2890, (float) 0.5);
        System.out.println("Motorista " + ((MotoristaTaxi) ref2).getNome()
                + " andou " + ((MotoristaTaxi) ref2).getTotalKmRodados()
                + " km no mês de julho.");
        System.out.println("Salario líquido do motorista = "
                + ref2.getSalarioLiquido());
        System.out.println("O professor " + ((Professor) ref1).getNome()
                + " tem " + ((Professor) ref1).getChsemanal() + " h/a por semana.");
        System.out.println("Salario líquido do professor = "
                + ref1.getSalarioLiquido());
    }
}
