package br.com.kliemann.atividadebimestral1.classes;

public class Telefone {
 
    private String marca;
    private String modelo;
    private boolean estadoTelefone;
    
    public void imprimir() {
        System.out.println("marca: " + marca +
                           "\nmodelo: " + modelo +
                           "\nestadoTelefone: " + estadoTelefone);
    }
    
    public void ligarSmartphone() {
        estadoTelefone = true;
    }
    
    public void desligarSmartphone() {
        estadoTelefone = false;
    }
    
    public void ligarParaContato() {
        estadoTelefone = true;
    }
    
    public void desligarChamada() {
        estadoTelefone = false;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
