/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.exemploSalario;

import java.util.ArrayList;

/**
 *
 * @author flavio-silva
 */
public class TesteInterfacePolimorfismo2 {

    public static void main(String args[]) {
        ArrayList<Salario> array = new ArrayList<Salario>();
        array.add(new Professor("Beltrano", 22222, 20, (float) 20.5));
        array.add(new MotoristaTaxi("Fulano", 123456, 8745, "30/08/2008",
                3028, 2890, (float) 0.5));
        for (Salario s : array) {
            if (s instanceof MotoristaTaxi) {
                System.out.println("Salario líquido do motorista" +s.getSalarioLiquido());
            }else {
                System.out.println("Salario líquido do professor" +s.getSalarioLiquido());
            }
        }
    }
}
