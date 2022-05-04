package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        String nomeProd = scanner.next();
        System.out.println("Valor unitário: ");
        double valorUnit = scanner.nextDouble();
        System.out.println("Valor de despesas: ");
        double valorDesp = scanner.nextDouble();
        System.out.println("Quantidade do produto: ");
        int qntdProd = scanner.nextInt();
        System.out.println("Percentual de lucro: ");
        int percentLucro = scanner.nextInt();

        double n = (valorUnit * qntdProd);
        double m = ((percentLucro * n) / 100) + n;
        double b = m + valorDesp;
        System.out.println("O valor final do " + nomeProd + " será de: R$ " + b + "0");
    }
}
