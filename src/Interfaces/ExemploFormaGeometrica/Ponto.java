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
public class Ponto implements FormaGeometrica {

    private int x, y;

    public void setPonto(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    public int getX() {
        return x;
    }

    public double area() {
        return 0.0;
    }

    public double volume() {
        return 0.0;
    }

    public String getNome() {
        return "Ponto"; }
}
