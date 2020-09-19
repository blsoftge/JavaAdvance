package br.com.blsoft.javaadvance.video22.comparator.comparator;

import java.util.Comparator;

import br.com.blsoft.javaadvance.video22.comparator.Cliente;

public class ComparatorCreditoPracaCrescente implements Comparator<Cliente>{

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        if(cliente1.getCreditoNaPraca() > cliente2.getCreditoNaPraca()){
            return 1;
        }
        return -1;
    }
    
}