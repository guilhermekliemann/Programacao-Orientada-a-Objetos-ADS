package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("O NÚMERO " + num + " É PAR!");
            } else {
                System.out.println("O NÚMERO " + num + " É ÍMPAR!");
            }

            if (num >= 0) {
                System.out.println("E TAMBÉM O NÚMERO " + num + " É POSITIVO!");
            } else {
                System.out.println("E TAMBÉM O NÚMERO " + num + " É NEGATIVO!");
            }

            System.out.println("Deseja encerrar o programa? Digite 'S'!");
            String close = scanner.next();

            if (close.toUpperCase().equals("S")) {
                System.out.println("Programa finalizado com sucesso!");
                break;
            }
        }
    }   
}
