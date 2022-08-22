package br.kliemann.sistemabancaria.model;

public class ContaBancaria {
    
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double saldo) {
        if(saldo < 0) {
            System.out.println("Não foi possivel sacar, saldo insuficiente.");
        }
    }
    
    public void depositar(double saldo) {
        System.out.println("Dinheiro depositado.");
    }
    
}
