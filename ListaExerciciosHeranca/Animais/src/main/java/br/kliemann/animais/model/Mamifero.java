package br.kliemann.animais.model;

public class Mamifero extends Animal {
    
    private String alimento;
    private int nrPatas = 4;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public void imprimeAnimal() {
        System.out.println("----------------------------" +
                           "\nAnimal: " + getNome() +
                           "\nComprimento: " + getComprimento() + " cm" +
                           "\nPatas: " + nrPatas +
                           "\nCor: " + getCor() +
                           "\nAmbiente: " + getAmbiente() +
                           "\nVelocidade: " + getVelocidade() + " m/s" +
                           "\nAlimento: " + getAlimento());
    }
    
}
