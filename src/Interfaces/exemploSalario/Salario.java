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
public interface Salario {

    public static final float SALARIO_MINIMO = 622;

    public abstract float getSalarioLiquido();

    public abstract float getQuantidadeSalariosMinimo();
}
