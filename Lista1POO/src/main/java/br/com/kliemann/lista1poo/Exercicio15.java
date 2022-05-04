package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que voçê deseja saber a tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println(num + " x " + i + " = " + tabuada);
        }
    }    
}
