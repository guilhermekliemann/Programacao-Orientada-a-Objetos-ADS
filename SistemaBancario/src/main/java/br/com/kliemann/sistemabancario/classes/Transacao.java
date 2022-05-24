package br.com.kliemann.sistemabancario.classes;

import java.time.LocalDate;

public class Transacao {
    
    private LocalDate data;
    private double valor;
    private String tipoTransacao;

    public Transacao() {
    }
    
    public Transacao(LocalDate data, double valor, String tipoTransacao) {
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    @Override
    public String toString() {
        return "Transacao{" + "data=" + data + ", valor=" + valor + ", tipoTransacao=" + tipoTransacao + '}';
    }    
    
}
