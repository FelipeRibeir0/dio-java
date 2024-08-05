package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //Atributos

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data,String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        LocalDate proximaData = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                proximaData = entry.getKey();
                System.out.println("O próximo evento "+ proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 24),"Aprendendo Novas Culturas","Jalim Habei");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 12),"Bom Dia e CIA","Paula Tejano");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 2, 5),"Te dei o Sol te Dei o Mar","Michel Teló");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
