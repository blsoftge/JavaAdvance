/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video16.tryCatchs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author BLSoft
 */
public class Arquivo {

    private File arquivo;
    private FileInputStream fileInputStream;

    public Arquivo() {

        arquivo = new File("testse.txt");

        try {
            fileInputStream = new FileInputStream(arquivo);
            fileInputStream.read();

        } catch (Exception ex) {
            System.err.println("Erro ao abrir arquivo");
        } finally {
            
            System.out.println("Executando o finally");
            
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                System.err.println("Erro ao fechar arquivo");
            }
        }

    }

}
