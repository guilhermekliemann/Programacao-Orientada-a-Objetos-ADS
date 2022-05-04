package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        int antecessor = number - 1;
        int sucessor = number + 1;
        System.out.println("O número ANTECESSOR de " + number + " é " + antecessor + ", e seu SUCESSOR é " + sucessor + "!");
    }   
}
