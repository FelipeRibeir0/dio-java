package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos

    private List<Livro> livrosList;

    public CatalogoLivros() {this.livrosList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> PesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro livro : livrosList) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalosAnos.add(livro);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livrosList.isEmpty()){
            for (Livro livro : livrosList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("A Metamorfose", "Franz Kafka", 1915);
        catalogoLivros.adicionarLivro("O Nome do Vento", "Patrick Rothfuss", 2007);
        catalogoLivros.adicionarLivro("A Cabana", "William P. Young", 2008);
        catalogoLivros.adicionarLivro("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 2011);
        catalogoLivros.adicionarLivro("O Alquimista", "Paulo Coelho", 1988);

        System.out.println(catalogoLivros.PesquisarPorAutor("Jane Austen"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Dom Quixote"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(2000,2010));
    }

}