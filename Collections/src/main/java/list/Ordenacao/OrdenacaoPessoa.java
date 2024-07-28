package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //Atributos

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Alice", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Carlos", 22, 1.80);
        ordenacaoPessoa.adicionarPessoa("Daniela", 28, 1.60);
        ordenacaoPessoa.adicionarPessoa("Eduardo", 35, 1.70);
        ordenacaoPessoa.adicionarPessoa("Fernanda", 27, 1.68);
        ordenacaoPessoa.adicionarPessoa("Gustavo", 24, 1.72);
        ordenacaoPessoa.adicionarPessoa("Helena", 32, 1.66);
        ordenacaoPessoa.adicionarPessoa("Igor", 29, 1.78);
        ordenacaoPessoa.adicionarPessoa("Juliana", 26, 1.63);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
