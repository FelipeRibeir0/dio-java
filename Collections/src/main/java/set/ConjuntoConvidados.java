package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributos

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        System.out.println("Existem " + conjunto.contarConvidados() + " dentro do Set de Convidados");

        String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};
        int[] codigosConvite = {101, 102, 103, 104, 105};

        for (int i = 0; i < nomes.length; i++) {
            conjunto.adicionarConvidados(nomes[i], codigosConvite[i]);
        }

        System.out.println("Existem " + conjunto.contarConvidados() + " dentro do Set de Convidados");
        conjunto.exibirConvidados();
        conjunto.removerConvidadoPorCodigoConvite(101);
        System.out.println("Agora existem " + conjunto.contarConvidados() + " dentro do Set de Convidados");
        conjunto.exibirConvidados();
    }
}
