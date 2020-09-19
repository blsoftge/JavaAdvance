/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video18.graficosJFreeChart;

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
import org.jfree.data.general.PieDataset;

/**
 *
 * @author BLSoft
 */
public class GraficoPizza {
    
    private final String tituloGrafico;
    private final PieDataset dataSetPizza;
    private JFreeChart graficoPizza;
    
    public GraficoPizza(String pTituloGrafico, PieDataset pPieDataset){
        this.tituloGrafico = pTituloGrafico;
        this.dataSetPizza = pPieDataset;
        
        //criar o grafico
        this.criarGrafico();
    }

    private void criarGrafico() {
        this.graficoPizza = ChartFactory.createPieChart(
                tituloGrafico, //titulo
                dataSetPizza, // dados do grafico
                true,           //legenda do grafico
                true,           //tooltip
                false);          //url
        
    }
    
    public void exibirGraficoEmFrame(int largura, int altura){
        JFrame frame = new JFrame(this.tituloGrafico);
        frame.setPreferredSize(new Dimension(altura, largura));
        ChartPanel painelDoGrafico =  new ChartPanel(this.graficoPizza);
        painelDoGrafico.setPreferredSize(new Dimension(altura, largura));
        frame.add(painelDoGrafico);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void ciarAqruivoJPEG(String caminhoDoArquivo, int largura, int altura){
        File arquivoGrafico = new File(caminhoDoArquivo + ".jpeg");
        try {
            ChartUtilities.saveChartAsJPEG(arquivoGrafico, this.graficoPizza, altura, altura);
            Desktop.getDesktop().open(arquivoGrafico);
        } catch (IOException ex) {
            Logger.getLogger(GraficoPizza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
