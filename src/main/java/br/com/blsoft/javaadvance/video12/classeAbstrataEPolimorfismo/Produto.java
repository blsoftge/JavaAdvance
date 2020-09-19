/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video12.classeAbstrataEPolimorfismo;

/**
 *
 * @author blsoft
 */
public abstract class Produto {

    protected String nome;
    protected double preco;

    public abstract double calcularPrecoFinal();

}
