/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator.Professor;

import Comparable.Professor.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author flavio-silva
 */
public class StaticExemplo {

    public static void imprime(ArrayList<Professor> lista, String msg) {
        System.out.println("Lista de professores "+msg);
        
        for (Professor f : lista) {
            System.out.println(f);
        }
    }

    public static void sort(ArrayList<Professor> lista, Comparator<Professor> cp) {
        
        int menor = 0;
        for(int i=0;i<lista.size();i++){
            menor = i;
            for(int j=i+1;j<lista.size();j++){
                if(( cp.compare(lista.get(menor), lista.get(j)) )>0){
                    menor = j;
                }
            }
            Professor aux = lista.get(i);
            lista.add(i, lista.get(menor));
            lista.remove(i+1);
            lista.add(menor,aux);
            lista.remove(menor+1);
        }
    }
}
