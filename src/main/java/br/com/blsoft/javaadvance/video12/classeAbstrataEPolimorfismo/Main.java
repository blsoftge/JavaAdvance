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
public class Main {

    public static void main(String[] args) {
        
        Venda venda = new Venda();
        
        ProdutoFisico produtoFisico = new ProdutoFisico("Pé de cabra", 100);
        ProdutoDigital produtodigital = new ProdutoDigital("Ebook Mariana", 50);
        
        venda.vender(produtoFisico);
        
    }
}

class Venda{
    
    public void vender(Produto produto){
        System.out.println("O produto foi vendido pelo preço de: "
        + produto.calcularPrecoFinal());
    }
    
}
