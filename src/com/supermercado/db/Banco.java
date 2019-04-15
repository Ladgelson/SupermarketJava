/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermercado.db;

import com.supermercado.model.Estoque;
import com.supermercado.model.Funcionario;
import com.supermercado.model.Produto;
import com.supermercado.model.UnidadeProduto;
import com.supermercado.model.Venda;
import java.util.ArrayList;
import java.util.List;

// Bannco de dados aperando em toda aplicação: Para ficar sendo armazenado mesmo que feche as telas, irá
// ficar salvo o Controle de Estoque - adição de produtos
// ficar salvo os funcionarios do Supermercado
// ficar salvo a Lista de Venda de produtos vendidos
public class Banco {
    
    public static final Estoque estoque = new Estoque();

    public static List<Funcionario> funcionarios = new ArrayList<>();
    
    public static List<Venda> vendas = new ArrayList<>();
    
    public static void iniciar() {
        //Inserção dos funcionarios do sistema (Nome, login, senha, é gerente ou não?)
        Funcionario gerente = new Funcionario("João", "joao", "123", true);  // João é o Gerente, retorna o Boolean True para isGerente
        Funcionario func1 = new Funcionario("Morgana", "morgana", "123", false); // Funcionario 1
        Funcionario func2 = new Funcionario("Micaías", "micaias", "123", false); // Funcionario 2
        Funcionario func3 = new Funcionario("Tobias", "tobias", "123", false); // Funcionario 3
        Funcionario func4 = new Funcionario("Jeferson", "jeferson", "123", false); // Funcionario 4
        Funcionario func5 = new Funcionario("Lucas", "lucas", "123", false); // Funcionario 5
        funcionarios.add(gerente);
        funcionarios.add(func1);
        funcionarios.add(func2);
        funcionarios.add(func3);
        funcionarios.add(func4);
        funcionarios.add(func5);

        //Inserção dos produtos no estoque: 
        Produto produto = new Produto("1", "Caneta", 1.5D, "pen.png", UnidadeProduto.UNITARIO, 10D); // 10D significa a quant. Inicial no Estoque de cada produto
        Produto produto2 = new Produto("2", "Lápis", 1.15D, "pencil.png", UnidadeProduto.UNITARIO, 10D);
        Produto produto3 = new Produto("3", "Frango", 11.99D, "chicken.png", UnidadeProduto.PESO, 10D);
        Produto produto4 = new Produto("4", "Óleo de soja Liza", 3.49D, "oil-barrel.png", UnidadeProduto.UNITARIO, 10D);
        Produto p5 = new Produto("5", "Banana", 0.5D, "no-picture.png", UnidadeProduto.UNITARIO, 10D);
        estoque.adicionar(p5);
        estoque.adicionar(produto);
        estoque.adicionar(produto2);
        estoque.adicionar(produto3);
        estoque.adicionar(produto4);
        System.out.println("Banco de dados iniciado:");
    }
    
}
