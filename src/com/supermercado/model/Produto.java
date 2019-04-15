/* autora:morgana */
package com.supermercado.model;

public class Produto {
    
    private String codigo;
    
    private String nome;
    
    private Double preco;
    
    private String foto;
    
    private UnidadeProduto unidade;
    
    // o relatório de estoque deve informar as quantidades disponíveis no inicio do dia
    private Double qtdeInicialEstoque; 
    // o relatório de estoque deve informar as quantidades disponíveis no fim do dia
    private Double qtdeAtualEstoque;
    
    // Aqui serve para passar informações dos produtos já existente no Estoque, por exemplo já tem um lápis com sua foto e seus
    // atributos que foram setados para o produto Lapis
    public Produto(String codigo, String nome, Double preco, String foto, UnidadeProduto unidade, Double qtdeInicialEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.foto = foto;
        this.qtdeInicialEstoque = qtdeInicialEstoque;
        this.qtdeAtualEstoque = qtdeInicialEstoque;
        this.unidade = unidade;
    }
    // Construtor para cadastrar novos produtos, com uma imagem padrão: "no-pictures.png"
    public Produto(String codigo, String nome, Double preco, UnidadeProduto unidade, Double qtdeInicialEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.foto = "no-pictures.png";
        this.qtdeInicialEstoque = qtdeInicialEstoque;
        this.qtdeAtualEstoque = qtdeInicialEstoque;
        this.unidade = unidade;
    }
    
    /* Getters e Setters */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }
    
    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public UnidadeProduto getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeProduto unidade) {
        this.unidade = unidade;
    }

    public Double getQtdeInicialEstoque() {
        return qtdeInicialEstoque;
    }

    public void setQtdeInicialEstoque(Double qtdeInicialEstoque) {
        this.qtdeInicialEstoque = qtdeInicialEstoque;
    }

    public Double getQtdeAtualEstoque() {
        return qtdeAtualEstoque;
    }

    public void setQtdeAtualEstoque(Double qtdeAtualEstoque) {
        this.qtdeAtualEstoque = qtdeAtualEstoque;
    }
    
}
