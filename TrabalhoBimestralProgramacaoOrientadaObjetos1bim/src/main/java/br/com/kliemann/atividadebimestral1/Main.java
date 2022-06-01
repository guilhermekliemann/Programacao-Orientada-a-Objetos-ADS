package br.com.kliemann.atividadebimestral1;

import br.com.kliemann.atividadebimestral1.classes.Carro;
import br.com.kliemann.atividadebimestral1.classes.Geladeira;
import br.com.kliemann.atividadebimestral1.classes.Lampada;
import br.com.kliemann.atividadebimestral1.classes.Retangulo;
import br.com.kliemann.atividadebimestral1.classes.Telefone;
import br.com.kliemann.atividadebimestral1.classes.Televisor;

//Guilherme Libano Kliemann - 00225869
public class Main {

    public static void main(String[] args) {
        
        System.out.println("--------------------------------");
        System.out.println("EXERCICIO 1\n");
        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(15.6);
        retangulo.setAltura(20);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.imprimir();
        
        System.out.println("--------------------------------");
        System.out.println("EXERCICIO 2\n");
        Geladeira geladeira = new Geladeira();
        geladeira.abrirPorta();
        geladeira.ligarGeladeira();
        geladeira.imprimir();
        System.out.println("*****");
        geladeira.fecharPorta();
        geladeira.desligarGeladeira();
        geladeira.imprimir();
        
        System.out.println("--------------------------------");
        System.out.println("EXERCICIO 3\n");
        Televisor televisor = new Televisor();
        televisor.ligar();
        televisor.setCanal(5);
        televisor.setVolume(30);
        televisor.setNumeroCanais(20);
        televisor.setVolumeMaximo(100);
        televisor.imprimir();
        System.out.println("*****");
        televisor.alterarCanalParaCima();
        televisor.alterarCanalParaCima();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.imprimir();
        System.out.println("*****");
        televisor.desligar();
        televisor.alterarCanalParaBaixo();
        televisor.abaixarVolume();
        televisor.imprimir();
        
        System.out.println("--------------------------------");
        System.out.println("EXERCICIO 4\n");
        Telefone telefone = new Telefone();
        telefone.setMarca("Xiaomi");
        telefone.setModelo("Note 11 PRO");
        telefone.ligarSmartphone();
        telefone.imprimir();
        System.out.println("*****");
        telefone.desligarSmartphone();
        telefone.imprimir();
        System.out.println("*****");
        telefone.ligarParaContato();
        telefone.imprimir();
        System.out.println("*****");
        telefone.desligarChamada();
        telefone.imprimir();
        
        System.out.println("--------------------------------");
        System.out.println("EXERCICIO 5\n");
        Lampada lampada = new Lampada();
        lampada.setMarca("Rickzz");
        lampada.setModelo("C-137");
        lampada.setPotencia(127);
        lampada.ligar();
        lampada.imprimir();
        System.out.println("*****");
        lampada.desligar();
        lampada.imprimir();
        
        System.out.println("--------------------------------");
        System.out.println("EXERCICIO 6\n");
        Carro carro = new Carro();
        carro.desligar();
        carro.setMarca("Toyota");
        carro.setModelo("Supra");
        carro.setPlaca("XXX-9999");
        carro.setNomeDoDono("Guilherme");
        carro.setChassi("24h LpKV1M Nu S61178");
        carro.setVelocimetro(0);
        carro.imprimir();
        System.out.println("*****");
        carro.ligar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.imprimir();
        
    }
    
}
