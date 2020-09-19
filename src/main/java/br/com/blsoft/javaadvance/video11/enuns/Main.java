/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video11.enuns;

/**
 *
 * @author blsoft
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente roberto =  new Cliente("Roberto", "Rua 1", TipoCliente.ESPECIAL);
        Cliente lucas =  new Cliente("Lucas", "Rua 2", TipoCliente.MAL_PAGADOR);
        Cliente juvencio =  new Cliente("Juvencio", "Rua 11", TipoCliente.VIP);
        
        venderFiado(lucas);
        
    }

    public static void venderFiado(Cliente cliente) {

        if (cliente.getTipoCliente() == TipoCliente.MAL_PAGADOR) {
            System.out.println(
                    "O cliente " + cliente.getNome()
                    + " NÃO PODE comprar fiado pois é do tipo "
                    + cliente.getTipoCliente()
            );
        } else {
            System.out.println(
                    "O cliente " + cliente.getNome()
                    + " PODE comprar fiado pois é do tipo "
                    + cliente.getTipoCliente()
            );
        }
    }

}
