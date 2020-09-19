/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video14.mensagens;

import java.util.ResourceBundle;

/**
 *
 * @author blsoft
 */
public class MensagensSistema {
    
    private static final ResourceBundle MSG_SISTEMA = ResourceBundle.getBundle("br.com.blsoft.mensagens.mensagens_sistema");
    
    public static String getMessage(String mensagem){
        if(MSG_SISTEMA.containsKey(mensagem)){
            return MSG_SISTEMA.getString(mensagem);
        }
        
        return "";
    }
    
}
