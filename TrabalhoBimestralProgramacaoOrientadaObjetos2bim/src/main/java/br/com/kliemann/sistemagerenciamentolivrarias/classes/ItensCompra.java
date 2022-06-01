package br.com.kliemann.sistemagerenciamentolivrarias.classes;

import java.util.ArrayList;

public class ItensCompra {

    public ItensCompra() {
        this.listaLivro = new ArrayList<>();
    }
    
    private ArrayList<Livro> listaLivro;

    public ArrayList<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<Livro> livro) {
        this.listaLivro = livro;
    }

    @Override
    public String toString() {
        return "\nItensCompra{" + "listaLivro=" + listaLivro + '}';
    }

}
