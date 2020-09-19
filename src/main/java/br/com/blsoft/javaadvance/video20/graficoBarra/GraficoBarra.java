/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video20.graficoBarra;

import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author BLSoft
 */
public class GraficoBarra {
    
    private final String tituloGrafico;
    private final String textoEixoX;
    private final String textoEixoY;
    private final DefaultCategoryDataset categoryDataSet;
    private JFreeChart graficoBarras;

    public GraficoBarra(String titutloGrafico, String textoEixoX, String textoEixoY, DefaultCategoryDataset categoryDataSet) {
        this.tituloGrafico = titutloGrafico;
        this.textoEixoX = textoEixoX;
        this.textoEixoY = textoEixoY;
        this.categoryDataSet = categoryDataSet;
        this.criarGrafico();
    }

    private void criarGrafico() {
        this.graficoBarras = ChartFactory.createBarChart(
                this.tituloGrafico,
                this.textoEixoX,
                this.textoEixoY,
                this.categoryDataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }
    
    public void exibirGraficoEmFrame(int largura, int altura) {
        JFrame frame = new JFrame(this.tituloGrafico);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(largura, altura));
        ChartPanel painelDoGrafico = new ChartPanel(this.graficoBarras);
        painelDoGrafico.setPreferredSize(new Dimension(largura, altura));
        frame.add(painelDoGrafico);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void ciarAqruivoJPEG(String caminhoDoArquivo, int largura, int altura) {
        File arquivoGrafico = new File(caminhoDoArquivo + ".jpg");
        try {
            ChartUtilities.saveChartAsJPEG(
                    arquivoGrafico,
                    this.graficoBarras,
                    largura,
                    altura
            );
            Desktop.getDesktop().open(arquivoGrafico);
        } catch (IOException ex) {
            
        }
    }
}
