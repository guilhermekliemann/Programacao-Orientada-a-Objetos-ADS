package br.kliemann.ingressos.model;

public class VIP extends Ingresso {
    
    public void imprimeValor() {
        System.out.println("Valor ingresso VIP: R$ " + getValorIngresso() + 20);
    }
    
}
