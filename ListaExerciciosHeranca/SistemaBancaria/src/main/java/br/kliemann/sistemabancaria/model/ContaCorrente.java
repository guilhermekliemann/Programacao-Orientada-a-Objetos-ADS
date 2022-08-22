package br.kliemann.sistemabancaria.model;

public class ContaCorrente extends ContaBancaria{
    
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void sacar() {
        if(getSaldo() + limite < 0) {
            System.out.println("Não foi possivel sacar, saldo insuficiente.");
        }
    }
    
}
