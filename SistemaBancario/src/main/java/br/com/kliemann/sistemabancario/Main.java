package br.com.kliemann.sistemabancario;

import br.com.kliemann.sistemabancario.classes.ContaCorrente;
import br.com.kliemann.sistemabancario.classes.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
       
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        cc.deposit(550.0);
        cc.withdraw(300.0);
        
        System.out.println(cc.toString());
        
        cp.deposit(700.0);
        cp.withdraw(400.0);
        
        System.out.println(cp.toString());
        
    }
    
}
