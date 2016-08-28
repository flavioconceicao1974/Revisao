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
public class Circulo implements FormaGeometrica {

    private Ponto centro;
    private int raio;

    public void setRaio(int r) {
        this.raio = r;
    }

    public int getRaio() {
        return raio;
    }

    public void setCentro(Ponto c) {
        this.centro = c;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double volume() {
        return 0.0;
    }

    public String getNome() {
        return "Circulo";
    }
}
