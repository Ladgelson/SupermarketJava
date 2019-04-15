package com.supermercado.model;


/*  autora: morgana*/
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.JOptionPane;

public class Estoque{
    
    // As entradas são as Lista de Produto.
    private List<Produto> entrada;

    // Construtor não inclui no diagrama de classes.
    public Estoque() {
        this.entrada = new ArrayList<Produto>();
    }
    
    // aqui estou adicionando um produto que é uma entrada da tabela
    public void adicionar(Produto produto) {
        Produto aux = BinarySearch(produto.getCodigo());
        if(aux == null){
            this.entrada.add(produto);
            ordenar();
        } else {
           JOptionPane.showMessageDialog(null, "O codigo escolhido já exite", "Código inválido", JOptionPane.ERROR_MESSAGE);
           return;
        }
    }
    
    // Aqui vou verificar se o Cod da entrada do Produto que coloquei é igual entrada de produto no Banco de Dados
    // logo, eu retorno as informações do Produto, isso ocorre em Leitor de código de Barras e nos caixas
    
    public Produto getProduto(String codigo){
        return BinarySearch(codigo);
    }
    // Getters e Setters das entradas dos Produtos
    public List<Produto> getEntrada() {
        return entrada;
    }

    public void setEntrada(List<Produto> entrada) {
        this.entrada = entrada;
    }
    
    public Produto BinarySearch(String codigo){
        int ini = 0;
        int fim = entrada.size()-1;
        int middle;
        while(ini <= fim){
            middle = (ini+fim)/2;
            int valor = this.entrada.get(middle).getCodigo().compareToIgnoreCase(codigo);
            if(valor == 0){
                return this.entrada.get(middle);
            } else if(valor > 0){
                fim = middle - 1;
            } else if(valor < 0){
                ini = middle + 1;
            }
        }
        return null;
    }
    
    public void ordenar(){
        Comparator c = Collections.reverseOrder();
        Collections.sort(this.entrada,new Comparator<Produto>() {
            @Override
            public int compare(Produto s1, Produto s2) {
                    return s1.getCodigo().compareToIgnoreCase(s2.getCodigo());
            }
        });
    }
}
