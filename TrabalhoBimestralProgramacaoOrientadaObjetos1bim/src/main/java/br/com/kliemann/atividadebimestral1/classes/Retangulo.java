package br.com.kliemann.atividadebimestral1.classes;

public class Retangulo {
    
    private double comprimento;
    private double altura;
    private double area;
    private double perimetro;
    
    public void imprimir() {
        System.out.println("comprimento: " + comprimento +
                           "\naltura: " + altura +
                           "\narea: " + area +
                           "\nperimetro: " + perimetro);
    }
    
    public double calcularArea() {
        area = comprimento * altura;
        return area;
    }
    
    public double calcularPerimetro() {
        perimetro = (comprimento * 2) + (altura * 2);
        return perimetro;
    }
    
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public double getComprimento() {
        return comprimento;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }
    
}
