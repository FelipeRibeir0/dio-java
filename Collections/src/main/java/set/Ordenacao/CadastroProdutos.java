package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }


    public Set<Produto> exibirProdutosPorNome(){
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "iPhone 14 Pro Max", 9999.99, 5);
        cadastroProdutos.adicionarProduto(2L, "O Senhor dos Anéis", 59.90, 20);
        cadastroProdutos.adicionarProduto(3L, "Geladeira Duplex", 2999.00, 3);
        cadastroProdutos.adicionarProduto(4L, "Arroz Branco 5kg", 25.99, 100);
        cadastroProdutos.adicionarProduto(5L, "Tênis Nike Air Force 1", 499.99, 15);

//        System.out.println(cadastroProdutos.produtoSet);

//        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
