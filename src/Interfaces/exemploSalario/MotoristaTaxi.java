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
public class MotoristaTaxi implements Salario {

    private String nome;
    private int cpf, numCarteira;
    private String dataExpiracao;
    private int numeroTaxi;
    private float totalKmRodados, valorKm;

    public MotoristaTaxi(String n, int c, int nc, String d,
            int num, float t, float v) {
        nome = n;
        cpf = c;
        numCarteira = nc;
        dataExpiracao = d;
        numeroTaxi = num;
        totalKmRodados = t;
        valorKm = v;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getNumCarteira() {
        return numCarteira;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public int getNumeroTaxi() {
        return numeroTaxi;
    }

    public float getTotalKmRodados() {
        return totalKmRodados;
    }

    public float valorKm() {
        return valorKm;
    }

    public float getSalarioLiquido() {
        float salBruto = totalKmRodados * valorKm;
        return (salBruto - (salBruto * (float) 0.05));
    }

    public float getQuantidadeSalariosMinimo() {
        return (getSalarioLiquido() / SALARIO_MINIMO);
    }
}
