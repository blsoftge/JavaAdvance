/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video11.enuns;

/**
 *
 * @author blsoft
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private TipoCliente tipoCliente;

    public Cliente(String nome, String endereco, TipoCliente tipoCliente) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    
}
