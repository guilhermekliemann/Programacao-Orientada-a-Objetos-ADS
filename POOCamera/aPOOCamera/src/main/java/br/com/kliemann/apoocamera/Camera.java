package br.com.kliemann.apoocamera;

// assesor + class + nomeClasse
public class Camera { // inicio da classe
    
    // inicio atributos
    String lente;
    float megaPixels;
    String processador;
    float qtdArmazenamentoSdCard;
    float qtdZoom;
    String modelo;
    String marca;
    boolean stFlash;
    // fim atributos
    
    // inicio metodos
    
    // tipo de retorno + nomeDoRetorno
    void tirarFotos() { // inicio do metodo
        System.out.println("Tirou Foto");
    } // fim do metodo
    
    // tipo de retorno + nomeDoRetorno
    void gravarVideos() { // inicio metodo
        System.out.println("Gravou VIdeo");
    } // fim do metodo
    
    void armazenar() { // inicio metodo
        System.out.println("Dados Armazenados");
    } // fim do metodo
    
} // fim da classe