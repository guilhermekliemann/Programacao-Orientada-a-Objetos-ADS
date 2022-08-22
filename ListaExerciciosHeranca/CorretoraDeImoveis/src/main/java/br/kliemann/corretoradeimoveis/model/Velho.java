package br.kliemann.corretoradeimoveis.model;

public class Velho extends Imovel {
    
    private double descontoPreco;

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }
    
    public void imprimeValor() {
        System.out.println("Preço do Imovel com valor descontado: R$ " + (getPreco() - descontoPreco));
    }
    
}
