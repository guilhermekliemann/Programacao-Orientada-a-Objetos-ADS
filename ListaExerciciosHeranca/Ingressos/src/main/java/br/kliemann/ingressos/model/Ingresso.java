package br.kliemann.ingressos.model;

public class Ingresso {
    
    private double valorIngresso;

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public void imprimeValor() {
        System.out.println("Valor ingresso: R$ " + valorIngresso);
    }
    
}
