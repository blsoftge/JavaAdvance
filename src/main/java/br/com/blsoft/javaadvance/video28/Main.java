package br.com.blsoft.javaadvance.video28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<Produto> carrinho = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                carrinho.add(new Produto("Produto " + i, "fisico", r.nextInt(1000), r.nextInt(2000)));
            }else{
                carrinho.add(new Produto("Produto " + i, "digital", -1 , r.nextInt(1000)));
            }
        }

        System.out.println("\nCARRINHO DE COMPRAS");
        carrinho.parallelStream().forEach(System.out::println);

    }
}
