/* autora:morgana */
package com.supermercado.model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    
    private Funcionario funcionario;
    
    private String caixa;
    
    private List<ItemVenda> itensVendidos;
    
    private Double totalRecebido;
    
    private FormaPagamento formaPagamento;

    public Venda(Funcionario funcionario, String caixa) {
        this.funcionario = funcionario;
        this.caixa = caixa;
        this.itensVendidos = new ArrayList<>();
        this.totalRecebido = 0D;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    public List<ItemVenda> getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(List<ItemVenda> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

    public Double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public Double calcularSubtotal() {
        Double subTotal = 0D;
        for (ItemVenda itemVendido : itensVendidos) {
            subTotal += itemVendido.calcularTotal();
        }
        return subTotal;
    }
    
    public Double calcularTroco() {
        Double subTotal = this.calcularSubtotal();
        return totalRecebido - subTotal;
    }
        
}
