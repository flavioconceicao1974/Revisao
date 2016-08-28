/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author flavio-silva
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        
        animal.add(new AnimalCao("Tuco",5));
        animal.add(new AnimalCao("Estrelinha",12));
        animal.add(new AnimalGato("Mimosa",7));
        animal.add(new AnimalBode("Tio Toni",5));
        animal.add(new AnimalGato("Zoraide",10));
        animal.add(new AnimalVaca("BlowCow",10));
        //Animal teste = new Animal("Foca",14); == não podem sem instanciados
        for( Animal a: animal){
            System.out.println(a);
            System.out.println("Som : "+a.emiteSom()+"\n");
        }
        
    }
}
