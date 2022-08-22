package br.kliemann.animais.model;

public class Peixe extends Animal {
    
    private String caracteristicas;
    private int nrPatas = 0;
    private String cor = "Cinzento";
    private String ambiente = "Mar";

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public void imprimeAnimal() {
        System.out.println("----------------------------" +
                           "\nAnimal: " + getNome() +
                           "\nComprimento: " + getComprimento() + " cm" +
                           "\nPatas: " + nrPatas +
                           "\nCor: " + cor +
                           "\nAmbiente: " + ambiente +
                           "\nVelocidade: " + getVelocidade() + " m/s" +
                           "\nCaracteristica: " + getCaracteristicas());
    }
    
}
