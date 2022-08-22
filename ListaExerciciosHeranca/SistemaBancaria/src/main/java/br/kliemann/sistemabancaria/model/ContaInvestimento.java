package br.kliemann.sistemabancaria.model;

public class ContaInvestimento extends ContaBancaria{
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo() {
        
    }
    
}
