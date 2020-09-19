package br.com.blsoft.javaadvance.video25.moeda;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        Moeda dinheiro1 = new Moeda("100");
        dinheiro1.dividirPor(new BigDecimal("2"));
        System.out.println("\n\n");
        System.out.println(dinheiro1.getValor());
        System.out.println("\n\n");
        System.out.println(dinheiro1.getValorFormatado());

    }
}
