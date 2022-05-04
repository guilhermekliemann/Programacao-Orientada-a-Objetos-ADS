package br.com.kliemann.apoocamera;

// acessor + class + nomeDaClasse

import java.util.Date;

public class APOOCamera { // inicio da classe

    // metodo
    public static void main(String[] args) { // incio do metodo
        
        // Classe + nomeObjeto = new Classe();
        Camera sony = new Camera();
        sony.lente = "Olho de Peixe";
        sony.marca = "Sony";
        sony.megaPixels = 48;
        sony.modelo = "T500";
        sony.processador = "i7";
        sony.qtdArmazenamentoSdCard = 1000000;
        sony.qtdZoom = 30;
        sony.stFlash = true;
        sony.tirarFotos();
        sony.armazenar();
        sony.gravarVideos();
        sony.armazenar();
        System.out.println(sony.lente);
        
        System.out.println("\n");
        
        Pessoa pessoaGuilherme = new Pessoa();
        pessoaGuilherme.nome = "Guilherme";
        pessoaGuilherme.cpf = "14356294939";
        pessoaGuilherme.altura = (float) 1.86;
        pessoaGuilherme.idade = 19;
        pessoaGuilherme.peso = 65;
        pessoaGuilherme.sexo = "Masculino";
        pessoaGuilherme.caminhar();
        pessoaGuilherme.levantar();
        pessoaGuilherme.comer();
        pessoaGuilherme.dormir();
        pessoaGuilherme.trabalhar();
        
    } // final do metodo
    
} //final da classe
