/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video14.mensagens;

import javax.swing.JOptionPane;

/**
 *
 * @author blsoft
 */
public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                MensagensSistema.getMessage("bem_vindo")
        );

        int opcao = JOptionPane.showConfirmDialog(null,
                MensagensSistema.getMessage("maior_idade")
        );

        if(opcao == 0){
            JOptionPane.showMessageDialog(null, MensagensSistema.getMessage("ok01"));
        }else{
            JOptionPane.showMessageDialog(null, MensagensSistema.getMessage("erro01"));
        }
        
    }
}
