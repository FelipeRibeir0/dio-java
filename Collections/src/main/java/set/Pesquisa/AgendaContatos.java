package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributos

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNumero(int numero){
    Set<Contato> contatosPorNumero = new HashSet<>();
    for (Contato c : contatos) {
        if (c.getNumero() == numero) {
            contatosPorNumero.add(c);
        }
    }
    return contatosPorNumero;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNomeContato(String novoNome, int numero) {
     Contato contatoAtualizado = null;
     for (Contato c : contatos) {
         if (c.getNumero() == numero) {
             c.setNome(novoNome);
             contatoAtualizado = c;
             break;
         }
     }
     return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Ana", 123456789);
        agenda.adicionarContato("Bruno", 987654321);
        agenda.adicionarContato("Carla", 456789123);
        agenda.adicionarContato("Diego", 321654987);
        agenda.adicionarContato("Elaine", 654987321);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNumero(123456789));
        System.out.println(agenda.pesquisarPorNome("Diego"));

        System.out.println("Contato atualizado: " + agenda.atualizarNomeContato("Ana Konda", 123456789));

        System.out.println(agenda.pesquisarPorNumero(123456789));
    }
}
