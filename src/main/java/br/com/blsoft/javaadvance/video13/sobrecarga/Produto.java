/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video13.sobrecarga;

/**
 *
 * @author blsoft
 */
public class Produto {
    
    private int largura;
    private int altura;
    private double profundidade;
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }
    
    
    public void calcularFrete(){
        
        this.preco += 10;
        
        System.out.println(
        "Produto simples frete = " + this.preco
        );
    }
    
    public void calcularFrete(int largura, int altura){
        this.preco += (largura + altura / (100));
        
        System.out.println(
        "Produto médio frete  = " + this.preco
        );
    }
    
    public void calcularFrete(int largura, int altura, double profundidade){
        this.preco += (largura + altura + profundidade / (100));
        
        System.out.println(
        "Produto complexo frete  = " + this.preco
        );
    }
    
    public void calcularFrete(double profundidade, int largura, int altura){
        this.preco += (largura + altura + profundidade / (1000));
        
        System.out.println(
        "Produto complexo frete  = " + this.preco
        );
    }
    
    
}
