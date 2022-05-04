package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int number1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("O maior número é " + number1);
        } else {
            System.out.println("O maior número é " + number2 + "!");
        }
    }
}
