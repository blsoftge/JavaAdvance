/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video17.throwsEx;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author BLSoft
 */
public class Arquivo {
    private File arquivo;
    private FileInputStream fileInputStream;
    
    public Arquivo() throws Exception{
        arquivo = new File("teste.txt");
        fileInputStream = new FileInputStream(arquivo);
        fileInputStream.read();
        fileInputStream.close();
    }
    
}
