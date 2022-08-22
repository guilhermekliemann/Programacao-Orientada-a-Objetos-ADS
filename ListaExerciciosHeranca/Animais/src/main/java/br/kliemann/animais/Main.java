package br.kliemann.animais;

import br.kliemann.animais.model.Mamifero;
import br.kliemann.animais.model.Peixe;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Zoo:");
        
        Mamifero camelo = new Mamifero();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Deserto");
        camelo.setVelocidade(2.0);
        camelo.setAlimento("Vegetais");
        camelo.imprimeAnimal();
        
        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        tubarao.setCaracteristicas("Barbatanas e Cauda");
        tubarao.imprimeAnimal();
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setAmbiente("Floresta");
        urso.setVelocidade(0.5);
        urso.setAlimento("Mel");
        urso.imprimeAnimal();
        
    }
}
