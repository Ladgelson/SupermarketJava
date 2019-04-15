/* autora:morgana*/
package com.supermercado.model;

public class Usuario {
    
    private String login;
    
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Boolean verifica(String login, String senha) {
        // login e a senha não importa se é maiusculo ou minusculo, será Ignorado e retornado.
        return this.login.equalsIgnoreCase(login) && this.senha.equalsIgnoreCase(senha); 
    }
    
}
