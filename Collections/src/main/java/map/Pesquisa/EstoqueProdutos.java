package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // Atributos

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome,preco,quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                valorTotal += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    menorPreco = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();

        estoque.adicionarProduto(1001, "Arroz", 50, 5.99);
        estoque.adicionarProduto(1002, "Feijão", 30, 7.49);
        estoque.adicionarProduto(1003, "Macarrão", 20, 3.89);
        estoque.adicionarProduto(1004, "Açúcar", 40, 4.25);
        estoque.adicionarProduto(1005, "Sal", 100, 2.99);

        estoque.exibirProduto();

        System.out.println("Valor total do Estoque: R$ "+estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoque.obterProdutoMaisBarato());
    }
}
