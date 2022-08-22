package br.kliemann.ingressos.model;

public class CamaroteInferior extends VIP {
    
    private String localizacao;
    
    public void imprimeLocalizacao() {
        System.out.println("Localização do camarote inferior é " + localizacao);
    }
    
}
