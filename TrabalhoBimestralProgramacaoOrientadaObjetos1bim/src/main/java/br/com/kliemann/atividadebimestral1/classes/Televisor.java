package br.com.kliemann.atividadebimestral1.classes;

public class Televisor {
    
    private boolean ligado;
    private int canal;
    private int volume;
    private int numeroCanais;
    private int volumeMaximo;
    
    public void imprimir() {
        System.out.println("ligado: " + ligado +
                           "\ncanal: " + canal +
                           "\nvolume: " + volume +
                           "\nnumeroCanais: " + numeroCanais +
                           "\nvolumeMaximo: " + volumeMaximo);
    }
    
    public void ligar() {
        ligado = true;
    }
    
    public void desligar() {
        ligado = false;
    }
    
    public void aumentarVolume() {
        volume = volume + 1;
    }
    
    public void abaixarVolume() {
        volume = volume - 1;
    }
    
    public void alterarCanalParaCima() {
        canal = canal + 1;
    }
    
    public void alterarCanalParaBaixo() {
        canal = canal - 1;
    }
    
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void setNumeroCanais(int numeroCanais) {
        this.numeroCanais = numeroCanais;
    }
    
    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }
    
}
