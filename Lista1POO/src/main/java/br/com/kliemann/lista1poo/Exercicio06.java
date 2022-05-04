package br.com.kliemann.lista1poo;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número de 1 à 12: ");
        int num = input.nextInt();
        
        switch(num) {
            case 1 -> System.out.println("Mês 1 é Janeiro!");
            case 2 -> System.out.println("Mês 2 é Fevereiro!");
            case 3 -> System.out.println("Mês 3 é Março!");
            case 4 -> System.out.println("Mês 4 é Abril!");
            case 5 -> System.out.println("Mês 5 é Maio!");
            case 6 -> System.out.println("Mês 6 é Junho!");
            case 7 -> System.out.println("Mês 7 é Julho!");
            case 8 -> System.out.println("Mês 8 é Agosto!");
            case 9 -> System.out.println("Mês 9 é Setembro!");
            case 10 -> System.out.println("Mês 10 é Outubro!");
            case 11 -> System.out.println("Mês 11 é Novembro!");
            case 12 -> System.out.println("Mês 12 é Dezembro!");
            default -> System.out.println("Não existe esse mês!");
        }
        
        /*switch(num) {
            case 1:
                System.out.println("Mês 1 é Janeiro!");
                break;
            case 2:
                System.out.println("Mês 2 é Fevereiro!");
                break;
            case 3:
                System.out.println("Mês 3 é Março!");
                break;
            case 4:
                System.out.println("Mês 4 é Abril!");
                break;
            case 5:
                System.out.println("Mês 5 é Maio!");
                break;
            case 6:
                System.out.println("Mês 6 é Junho!");
                break;
            case 7:
                System.out.println("Mês 7 é Julho!");
                break;
            case 8:
                System.out.println("Mês 8 é Agosto!");
                break;
            case 9:
                System.out.println("Mês 9 é Setembro!");
                break;
            case 10:
                System.out.println("Mês 10 é Outubro!");
                break;
            case 11:
                System.out.println("Mês 11 é Novembro!");
                break;
            case 12:
                System.out.println("Mês 12 é Dezembro!");
                break;
            default:
               System.out.println("Não existe esse mês!");
        */
    }  
}
