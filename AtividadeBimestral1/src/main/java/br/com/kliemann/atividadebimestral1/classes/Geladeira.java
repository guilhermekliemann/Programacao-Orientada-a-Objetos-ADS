package br.com.kliemann.atividadebimestral1.classes;

public class Geladeira {
    
    private boolean ligado;
    private boolean portaFechada;
    private String imprimir;
    
    public void imprimir() {
        System.out.println("portaFechada: " + portaFechada +
                           "\nligado: " + ligado);
    }
    
    public void ligarGeladeira() {
        ligado = true;
    }
    
    public void desligarGeladeira() {
        ligado = false;
    }
    
    public void abrirPorta() {
        portaFechada = false;
    }
    
    public void fecharPorta() {
        portaFechada = true;
    }
    
}
