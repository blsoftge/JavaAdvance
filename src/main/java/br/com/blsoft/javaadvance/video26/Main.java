package br.com.blsoft.javaadvance.video26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){

        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new Produto("Peteca", "fisico", 100, 5.90));
        carrinho.add(new Produto("Ebook", "digital", -1, 73));
        carrinho.add(new Produto("Mouse", "fisico", 200, 35.90));
        carrinho.add(new Produto("Livro", "fisico", 90, 9.90));
        carrinho.add(new Produto("Queijo", "fisico", 50, 55));
        carrinho.add(new Produto("Discografia Ana raio", "digital", -1, 99.99));

        System.out.println("\nCARRINHO ORIGINAL");
        carrinho.stream().forEach(System.out::println); 

        List<Produto> carrinhoFisico = 
            carrinho.stream()
            .filter(produto -> produto.getTipo().equals("fisico"))
            .collect(Collectors.toList());
            System.out.println("\nCARRINHO DE ITENS FISICOS");
            carrinhoFisico.stream().forEach(System.out::println);

        List<Produto> carrinhoOrdenado =
            carrinho.stream()
            .sorted(Comparator.comparing(Produto::getQuantidade).reversed())
            .collect(Collectors.toList());
            System.out.println("\nCARRINHO ORDENADO");
            carrinhoOrdenado.stream().forEach(System.out::println);
        
        List<Produto> carrinhoFiltradoOrdenado = 
            carrinho.stream()
            .filter(produto -> produto.getTipo().equals("fisico"))
            .filter(produto -> produto.getPreco() > 30)
            .sorted(Comparator.comparing(Produto::getQuantidade))
            .collect(Collectors.toList());
        System.out.println("\nCARRINHO ITENS FISICOS, PRECO > 30 E ORDENADO PELO ESTOQUE");
	    carrinhoFiltradoOrdenado.forEach(System.out::println);

    }
}
