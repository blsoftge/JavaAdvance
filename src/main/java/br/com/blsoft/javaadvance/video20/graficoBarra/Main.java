/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video20.graficoBarra;

import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {
        
        final String titulo = "USUÁRIOS E PAIXÕES";
        final String quantidadeUsuarios = "QUANTIDADE DE USUÁRIO";
        
        DefaultCategoryDataset datasetBarras = new DefaultCategoryDataset();
        datasetBarras.addValue(2000, "Java 1.5", quantidadeUsuarios);
        datasetBarras.addValue(8000, "Java 1.6", quantidadeUsuarios);
        datasetBarras.addValue(12000, "Java 1.7", quantidadeUsuarios);
        datasetBarras.addValue(20000, "Java 1.8", quantidadeUsuarios);
        
        GraficoBarra graficoBarra = new GraficoBarra(titulo, "", quantidadeUsuarios, datasetBarras);
        graficoBarra.exibirGraficoEmFrame(800, 640);
        
    }
}