/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video15.interfaces;

/**
 * * @author blsoft
 */
public class Main {
    
    public static void main(String args[]){
        
        Entregas entrega1 = new Entregas();
        entrega1.setDestino("Belo horizonte");
        entrega1.setProduto("Playstation");
        
        entrega1.setTipoFrete(new FreteSedexUltra());
        
        System.out.println(entrega1.getTipoFrete().calcularValor(100));
        
        
    }
    
}
