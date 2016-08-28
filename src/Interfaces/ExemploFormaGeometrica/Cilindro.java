/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ExemploFormaGeometrica;

/**
 *
 * @author flavio-silva
 */
public class Cilindro implements FormaGeometrica {

    private int altura;
    private Circulo circulo;

    
    public double area() {
        return 2 * circulo.area() + 2 * Math.PI * circulo.getRaio() * altura;
    }

    public double volume() {
        return circulo.area() * altura;
    }

    public String getNome() {
        return "Cilindro";
    }    
}
