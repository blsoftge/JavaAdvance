/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video12.classeAbstrataEPolimorfismo;

/**
 *
 * @author bruno
 */
public class ProdutoFisico extends Produto{

    private final double FRETE  = 50;
    
    public ProdutoFisico(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public double calcularPrecoFinal() {
        return this.preco + FRETE;
    }
    
}
