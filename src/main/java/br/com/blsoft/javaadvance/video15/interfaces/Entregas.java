/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video15.interfaces;

/**
 *
 * @author blsoft
 */
public class Entregas {
    
    private String destino;
    private String produto;
    
    //magica
    private ITipoFrete tipoFrete;
    
    

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public ITipoFrete getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(ITipoFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }
    
}
