package br.com.blsoft.javaadvance.video27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){

        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new Produto("Peteca", "fisico", 100, 5.90));
        carrinho.add(new Produto("Ebook", "digital", -1, 73));
        carrinho.add(new Produto("Ebook", "digital", -1, 73));
        carrinho.add(new Produto("Mouse", "fisico", 200, 35.90));
        carrinho.add(new Produto("Livro", "fisico", 90, 9.90));
        carrinho.add(new Produto("Queijo", "fisico", 50, 55));
        carrinho.add(new Produto("Discografia Ana raio", "digital", -1, 99.99));
        carrinho.add(new Produto("Discografia Ana raio", "digital", -1, 99.99));

        System.out.println("\nCARRINHO ORIGINAL");
        carrinho.forEach(System.out::println); 

        //map
        // List<Double> precosProdutos = 
        //     carrinho.stream()
        //     .sorted(Comparator.comparing(Produto::getPreco))
        //     .map(Produto::getPreco)
        //     .collect(Collectors.toList());

        // System.out.println("\nPREÇOS DOS PRODUTOS");
	    // precosProdutos.forEach(System.out::println);


        //distinct
        // List<Produto> carrinhoItensUnicos = 
        //     carrinho.stream()
        //     .distinct()
        //     .collect(Collectors.toList());

        // System.out.println("\nITENS UNICOS");
	    // carrinhoItensUnicos.stream().forEach(System.out::println);

        //limit
        List<Produto> carrinhoItensLimitados = 
            carrinho.stream()
            .sorted(Comparator.comparing(Produto::getQuantidade).reversed())
            .limit(3)
            .collect(Collectors.toList());

        System.out.println("\nITENS LIMITADOS");
	    carrinhoItensLimitados.stream().forEach(System.out::println);
        
    }
}
