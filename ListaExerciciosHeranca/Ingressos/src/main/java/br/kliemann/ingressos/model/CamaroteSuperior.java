package br.kliemann.ingressos.model;

public class CamaroteSuperior extends VIP {
    
    public void imprimeIngresso() {
        System.out.println("Valor do ingresso do camarote superior: R$ " + getValorIngresso() + 100);
    }
    
}
