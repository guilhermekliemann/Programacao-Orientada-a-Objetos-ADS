package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu sexo: ");
        String sexo = scanner.next();
        System.out.println("Meu nome é " + nome + "," + " tenho " + idade + " anos e sou do sexo " + sexo + "!");
    }
}
