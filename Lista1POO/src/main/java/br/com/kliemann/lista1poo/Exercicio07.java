package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu primeiro salário: ");
        double salario1 = scanner.nextDouble();
        System.out.println("Digite seu segundo salário: ");
        double salario2 = scanner.nextDouble();
        System.out.println("Digite seu terceiro salário: ");
        double salario3 = scanner.nextDouble();
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média total dos três salários é de: " + media);
    }   
}
