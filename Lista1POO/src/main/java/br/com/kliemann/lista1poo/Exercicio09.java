package br.com.kliemann.lista1poo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        String aluno = scanner.next();
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 6.0) {
            System.out.println("A média de " + aluno + " foi de " + df.format(media) + ": APROVADO");
        } else {
            System.out.println("A média de " + aluno + " foi de " + df.format(media) + ": REPROVADO");
        }
    }    
}
