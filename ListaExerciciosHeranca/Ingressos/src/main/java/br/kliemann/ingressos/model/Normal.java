package br.kliemann.ingressos.model;

public class Normal extends Ingresso {
    
    public void imprimeValor() {
        System.out.println("Valor ingresso normal: R$ " + getValorIngresso());
    }
    
}
