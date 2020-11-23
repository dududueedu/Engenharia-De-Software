package br.ufc.quixada.si.model;
/**
 *
 * @author Edu da Silva
 */
public class visao {
    private int contP;
    private int contC;
    private double valorTotalDeVendas;

    public visao(){}
    public visao(int contP, int contC, double valorTotalDeVendas) {
        this.contP = contP;
        this.contC = contC;
        this.valorTotalDeVendas = valorTotalDeVendas;
    }

    public int getContP() {
        return contP;
    }

    public void setContP(int contP) {
        this.contP = contP;
    }

    public int getContC() {
        return contC;
    }

    public void setContC(int contC) {
        this.contC = contC;
    }  

    public double getValorTotalDeVendas() {
        return valorTotalDeVendas;
    }

    public void setValorTotalDeVendas(double valorTotalDeVendas) {
        this.valorTotalDeVendas = valorTotalDeVendas;
    }
    
}