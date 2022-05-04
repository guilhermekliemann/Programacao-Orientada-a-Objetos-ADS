package br.com.kliemann.lista1poo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cotação do Dólar: ");
        double dolar = scanner.nextDouble();
        System.out.println("Digite o valor em Dólares: ");
        double valorDolar = scanner.nextDouble();
        double real = valorDolar * dolar;
        System.out.println("US$ " + df.format(valorDolar) + " convertidos em reais resulta em: R$ " + df.format(real));
    }  
}
