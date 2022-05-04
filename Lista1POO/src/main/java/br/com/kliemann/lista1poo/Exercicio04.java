package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em anos: ");
        int anos = scanner.nextInt();
        System.out.println("Meses: ");
        int meses = scanner.nextInt();
        System.out.println("Dias: ");
        int dias = scanner.nextInt();
        int totalDias = anos * 365 + meses * 30 + dias;
        System.out.println("Sua idade total em dias é: " + totalDias);
    }  
}
