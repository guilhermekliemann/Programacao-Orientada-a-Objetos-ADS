package br.kliemann.corretoradeimoveis.model;

public class Novo extends Imovel {
    
    private double precoAdicional;

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
    
    public void imprimeValor() {
        System.out.println("Preço do Imovel com valor adicional: R4 " + (getPreco() + precoAdicional));
    }
    
}
