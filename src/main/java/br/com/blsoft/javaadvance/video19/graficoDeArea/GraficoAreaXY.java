/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video19.graficoDeArea;

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
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author BLSoft
 */
public class GraficoAreaXY {
    private final String tituloGrafico;
    private final XYDataset datasetAreaXY;
    private JFreeChart graficoAreaXY;

    public GraficoAreaXY(String tituloGrafico, XYDataset datasetAreaXY) {
        this.tituloGrafico = tituloGrafico;
        this.datasetAreaXY = datasetAreaXY;
        this.criarGrafico();
    }
    
    private void criarGrafico(){
        this.graficoAreaXY = ChartFactory.createXYAreaChart(
                tituloGrafico,
                "Ano",
                "Quantidade",
                this.datasetAreaXY,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
    }
    
    public void exibirGraficoEmFrame(int largura, int altura) {
        JFrame frame = new JFrame(this.tituloGrafico);
        frame.setPreferredSize(new Dimension(largura, altura));
        ChartPanel painelDoGrafico = new ChartPanel(this.graficoAreaXY);
        painelDoGrafico.setPreferredSize(new Dimension(largura, altura));
        frame.add(painelDoGrafico);
        frame.pack();
        frame.setVisible(true);
    }

    public void ciarAqruivoJPEG(String caminhoDoArquivo, int largura, int altura) {
        File arquivoGrafico = new File(caminhoDoArquivo + ".jpg");
        try {
            ChartUtilities.saveChartAsJPEG(arquivoGrafico, this.graficoAreaXY, 1000, 800);
            Desktop.getDesktop().open(arquivoGrafico);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
