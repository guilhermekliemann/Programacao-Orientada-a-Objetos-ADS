package br.com.kliemann.apoocamera;

import java.util.Date;

public class Pessoa {
    
    String cpf;
    String nome;
    String sexo;
    float altura;
    float peso;
    Date dataNasc;
    int idade;
    
    void caminhar() {
        System.out.println("Caminhando no Parque");
    }
    
    void levantar() {
        System.out.println("Levantando da Cama");
    }
    
    void comer() {
        System.out.println("Comendo Churrasco");
    }
    
    void dormir() {
        System.out.println("Dormindo 12 horas");
    }
    
    void trabalhar() {
        System.out.println("Trabalho Escravo na BG");
    }
    
}
