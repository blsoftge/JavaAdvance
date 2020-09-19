/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video18.graficosJFreeChart;

import org.jfree.data.general.DefaultPieDataset;



/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {
        
        DefaultPieDataset dadosDoGrafico = new DefaultPieDataset();
        dadosDoGrafico.setValue("Java 5", 10);
        dadosDoGrafico.setValue("Java 6", 20);
        dadosDoGrafico.setValue("Java 7", 30);
        dadosDoGrafico.setValue("Java 8", 50);
        
        GraficoPizza graficoPizza = new GraficoPizza("Versões mais usadas do java", dadosDoGrafico);
        graficoPizza.exibirGraficoEmFrame(500, 500);
//        graficoPizza.ciarAqruivoJPEG("versoes_usadas_java", 800, 640);
        
        
    }
}
