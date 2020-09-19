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
public class Main {

    public static void main(String[] args) {
       
        Produto p = new Produto(100);
        
        
        p.calcularFrete( 30.0, 100, 15);
        
    }
}
