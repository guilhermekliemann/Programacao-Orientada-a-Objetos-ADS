package br.com.kliemann.sistemagerenciamentolivrarias.classes;

import java.util.ArrayList;

public class Venda {

    public Venda() {
        this.itensCompra = new ArrayList<>();
    }

    public Venda(CadastroCliente cliente, FormaPagamento formasPagamento) {
        this.cliente = cliente;
        this.formasPagamento = formasPagamento;
    }
    
    private CadastroCliente cliente;
    private ArrayList<ItensCompra> itensCompra;
    private FormaPagamento formasPagamento;

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItensCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ArrayList<ItensCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    public FormaPagamento getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(FormaPagamento formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    @Override
    public String toString() {
        return "\nVenda{" + "cliente=" + cliente + ", itensCompra=" + itensCompra + ", formasPagamento=" + formasPagamento + '}';
    }

}
