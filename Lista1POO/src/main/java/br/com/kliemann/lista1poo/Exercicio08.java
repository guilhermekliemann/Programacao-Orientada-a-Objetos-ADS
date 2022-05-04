package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        float divisao = num1 / num2;
        System.out.println("A soma dos dois números resulta em: " + soma);
        System.out.println("A subtração dos dois números resulta em: " + subtracao);
        System.out.println("A divisão dos dois números resulta em: " + divisao);
    }    
}
