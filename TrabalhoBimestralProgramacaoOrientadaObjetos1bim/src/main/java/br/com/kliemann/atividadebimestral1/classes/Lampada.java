package br.com.kliemann.atividadebimestral1.classes;

public class Lampada {
    
    private String marca;
    private String modelo;
    private int potencia;
    private boolean estadoLampada;
    
    public void imprimir() {
        System.out.println("marca: " + marca +
                           "\nmodelo: " + modelo +
                           "\npotencia: " + potencia +
                           "\nestadoLampada: " + estadoLampada);
    }
    
    public void ligar() {
        estadoLampada = true;
    }
    
    public void desligar() {
        estadoLampada = false;
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
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
}
