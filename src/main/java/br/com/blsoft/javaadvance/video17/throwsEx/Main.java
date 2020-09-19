/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video17.throwsEx;

/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {
        
        try {
            new Arquivo();
        } catch (Exception ex) {
            System.err.println("Excecao tratada no main");
        } 
        
    }

}
