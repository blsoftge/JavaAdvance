/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video15.interfaces;

/**
 *
 * @author bruno
 */
public class FreteSedexUltra implements ITipoFrete{

    @Override
    public float calcularValor(float valor) {
        return valor + (valor / 100 * 50);
    }
    
}
