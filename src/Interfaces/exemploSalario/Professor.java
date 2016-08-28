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
public class Professor implements Salario {

    private String nome;
    private int matricula;
    private int cargaHoraria;
    private float valorHora;

    public Professor(String n, int m, int c, float v) {
        nome = n;
        matricula = m;
        cargaHoraria = c;
        valorHora = v;
    }

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return (nome);
    }

    public void setMatricula(int m) {
        matricula = m;
    }

    public int getMatricula() {
        return (matricula);
    }

    public void setChsemanal(int c) {
        cargaHoraria = c;
    }

    public int getChsemanal() {
        return (cargaHoraria);
    }

    public float getChmensal() {
        return (cargaHoraria * (float) 4.5);
    }

    public void setValorHora(float v) {
        valorHora = v;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getSalarioLiquido() {
        float salBruto = valorHora * cargaHoraria * (float) 4.5;
        return (salBruto - (salBruto * (float) 0.08));
    }

    public float getQuantidadeSalariosMinimo() {
        return (getSalarioLiquido() / SALARIO_MINIMO);
    }
}
