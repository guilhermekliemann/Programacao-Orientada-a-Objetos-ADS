package br.com.kliemann.atividadebimestral1.classes;

public class Carro {
    
    private boolean estadoVeiculo;
    private String marca;
    private String modelo;
    private String placa;
    private String nomeDoDono;
    private String chassi;
    private int velocimetro;
    
    public void imprimir() {
        System.out.println("estadoVeiculo: " + estadoVeiculo +
                           "\nmarca: " + marca +
                           "\nmodelo: " + modelo +
                           "\nplaca: " + placa +
                           "\nnomeDoDono: " + nomeDoDono +
                           "\nchassi: " + chassi +
                           "\nvelocimetro: " + velocimetro);
    }
    
    public void ligar() {
        estadoVeiculo = true;
    }
    
    public void desligar() {
        estadoVeiculo = false;
    }
    
    public void acelerar() {
        velocimetro = velocimetro + 10;
    }
    
    public void frear() {
        velocimetro = velocimetro - 10;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }
    
    public String getNomeDoDono() {
        return nomeDoDono;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    public String getChassi() {
        return chassi;
    }
    
    public void setVelocimetro(int velocimetro) {
        this.velocimetro = velocimetro;
    }
    
    public int getVelocimetro() {
        return velocimetro;
    }
    
}