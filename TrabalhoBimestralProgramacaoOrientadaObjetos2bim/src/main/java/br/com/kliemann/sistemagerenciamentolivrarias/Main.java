package br.com.kliemann.sistemagerenciamentolivrarias;

import br.com.kliemann.sistemagerenciamentolivrarias.classes.*;

public class Main {

    public static void main(String[] args) {
        
        EnderecoCliente enderecoGuilherme = new EnderecoCliente();
        enderecoGuilherme.setRua("Rua General Alcides Etchegoyen");
        enderecoGuilherme.setNumero(1556);
        enderecoGuilherme.setBairro("Jardim La Salle");
        enderecoGuilherme.setCidade("Toledo");
        enderecoGuilherme.setEstado("Paraná");
        enderecoGuilherme.setPais("Brasil");
        
        CadastroCliente guilherme = new CadastroCliente();
        guilherme.setNome("Guilherme Kliemann");
        guilherme.setDtNasc("13/02/2003");
        guilherme.setCpf("987456321-11");        
        guilherme.setCodigo(1);
        guilherme.setEndereco(enderecoGuilherme);
        
        Livro escolhaGuilherme1 = new Livro();
        escolhaGuilherme1.setTitulo("O Mítico Homem-Mês");
        escolhaGuilherme1.setEditora("Alta Books");
        escolhaGuilherme1.setAutor("Frederick P. Brooks Jr.");
        escolhaGuilherme1.setAnoLancamento(1975);
        escolhaGuilherme1.setGenero("Tecnologia");
        escolhaGuilherme1.setDescricao("Ensaios sobre Engenharia de Software");
        escolhaGuilherme1.setNumPaginas(287);
        escolhaGuilherme1.setQtdEstoque(100);
        escolhaGuilherme1.setVlrPrecoVenda(67.77);
        
        Livro escolhaGuilherme2 = new Livro();
        escolhaGuilherme2.setTitulo("Técnicas de Invasão");
        escolhaGuilherme2.setEditora("Labrador");
        escolhaGuilherme2.setAutor("Bruno Fraga");
        escolhaGuilherme2.setAnoLancamento(2019);
        escolhaGuilherme2.setGenero("Tecnologia");
        escolhaGuilherme2.setDescricao("Aprenda as Técnicas Usadas por Hackers em Invasões Reais");
        escolhaGuilherme2.setNumPaginas(293);
        escolhaGuilherme2.setQtdEstoque(50);
        escolhaGuilherme2.setVlrPrecoVenda(52.69);
        
        Livro escolhaGuilherme3 = new Livro();
        escolhaGuilherme3.setTitulo("Código Limpo");
        escolhaGuilherme3.setEditora("Alta Books");
        escolhaGuilherme3.setAutor("Robert C. Martin");
        escolhaGuilherme3.setAnoLancamento(2009);
        escolhaGuilherme3.setGenero("Tecnologia");
        escolhaGuilherme3.setDescricao("Habilidades Práticas do Agile Software");
        escolhaGuilherme3.setNumPaginas(411);
        escolhaGuilherme3.setQtdEstoque(200);
        escolhaGuilherme3.setVlrPrecoVenda(55.50);
        
        ItensCompra compraGuilherme = new ItensCompra();
        compraGuilherme.getListaLivro().add(escolhaGuilherme1);
        compraGuilherme.getListaLivro().add(escolhaGuilherme2);
        compraGuilherme.getListaLivro().add(escolhaGuilherme3);
        
        FormaPagamento formaPagamentoGuilherme = new FormaPagamento();
        formaPagamentoGuilherme.setCodigo(1);
        formaPagamentoGuilherme.setDescricao("Dinheiro");
        
        Venda vendaGuilherme = new Venda();
        vendaGuilherme.setCliente(guilherme);
        vendaGuilherme.setFormasPagamento(formaPagamentoGuilherme);
        vendaGuilherme.getItensCompra().add(compraGuilherme);
        System.out.println(vendaGuilherme);
        
    }

}
