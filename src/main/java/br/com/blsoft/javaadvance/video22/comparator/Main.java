/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video22.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.blsoft.javaadvance.video22.comparator.comparator.ComparatorCreditoPracaCrescente;
import br.com.blsoft.javaadvance.video22.comparator.comparator.ComparatorNomeCrescente;
import br.com.blsoft.javaadvance.video22.comparator.comparator.ComparatorNomeDescrescente;

/**
 *
 * @author BLSoft
 */
public class Main {
    public static void main(String[] args) {
        // criar a lista de clientes para teste no main
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Edson", 2300));
        listaClientes.add(new Cliente("Bruno", 3000));
        listaClientes.add(new Cliente("Falconi", 6000));
        listaClientes.add(new Cliente("Avelar", 2000));
        listaClientes.add(new Cliente("Diogo", 1000));
        listaClientes.add(new Cliente("Carlos", 1500));

        System.out.println("LISTA ORIGINAL");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }
        
        System.out.println("LISTA ORDENADA POR NOME CRESCENTE");
        Collections.sort(listaClientes, new ComparatorNomeCrescente());
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }
        
        System.out.println("LISTA ORDENADA POR NOME DECRESCENTE");
        Collections.sort(listaClientes, new ComparatorNomeDescrescente());
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }

        System.out.println("LISTA ORDENADA POR CREDITO CRESCENTE");
        Collections.sort(listaClientes, new ComparatorCreditoPracaCrescente());
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }
    }
}
