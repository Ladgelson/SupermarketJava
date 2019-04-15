/* autora:morgana */
package com.supermercado.model;

// Funcionario herdou aqui os atributos Login e Usuario.
public class Funcionario extends Usuario{
    
    private String nome;
    // O gerente é um funcionario
    private Boolean isGerente;

    public Funcionario(String nome, String login, String senha, Boolean isGerente) {
        super(login, senha);
        this.nome = nome;
        this.isGerente = isGerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getIsGerente() {
        return isGerente;
    }

    public void setIsGerente(Boolean isGerente) {
        this.isGerente = isGerente;
    }
    
}
