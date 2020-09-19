package br.com.blsoft.javaadvance.video22.comparator.comparator;

import java.util.Comparator;

import br.com.blsoft.javaadvance.video22.comparator.Cliente;

public class ComparatorNomeDescrescente implements Comparator<Cliente>{

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        if(cliente1.getNome().compareTo(cliente2.getNome()) > 0){
            return -1;
        }
        return 1;
    }
    
}