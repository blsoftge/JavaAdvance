/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video19.graficoDeArea;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author BLSoft
 */
public class Main {
    public static void main(String[] args){
        
        XYSeries pontosDoGrafico = new XYSeries("Programadores Java por ano");
        pontosDoGrafico.add(1995, 100);
        pontosDoGrafico.add(2000, 5000);
        pontosDoGrafico.add(2005, 20000);
        pontosDoGrafico.add(2010, 17000);
        pontosDoGrafico.add(2015, 40000);
        pontosDoGrafico.add(2025, 20000);
        
        XYDataset datasetAreaXY = new XYSeriesCollection(pontosDoGrafico);
        
        GraficoAreaXY graficoAreaXY = new GraficoAreaXY("Programadores Java S2", datasetAreaXY);
        graficoAreaXY.exibirGraficoEmFrame(800, 640);
        
    }
}
