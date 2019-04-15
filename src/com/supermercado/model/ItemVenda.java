/* autora:morgana*/
package com.supermercado.model;


public class ItemVenda {
    // Cód, descrição e Valor é do Produto!
    // Nº do item, Qtd e Total não é do Produto! ( Esses requisitos vão ficar dentro da ClasseItemdaVenda). 
    private int numero;
    
    private Produto produto;
    
    private Double quantidade;

    public ItemVenda(int numero, Produto produto, Double quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public Double calcularTotal() {
        return quantidade * produto.getPreco();
    } 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    
}
