package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é PAR ou ÍMPAR: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("O NÚMERO " + number + " É PAR!");
        } else {
            System.out.println("O NÚMERO " + number + " É ÍMPAR!");
        }
    }
}
