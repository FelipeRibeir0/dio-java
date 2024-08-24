import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJavaExcecoes = new Curso();
        cursoJavaExcecoes.setTitulo("Java e Tratamento de Exceções");
        cursoJavaExcecoes.setDescricao("Aprenda a dominar o Java e Tratamento de Exceções com nossos módulos especializados.");
        cursoJavaExcecoes.setCargaHoraria(1);

        Curso cursoJavaStream = new Curso();
        cursoJavaStream.setTitulo("Ganhando Produtividade com Stream API");
        cursoJavaStream.setDescricao("Ao longo do curso, os desenvolvedores aprenderão técnicas poderosas para filtrar, mapear, reduzir e ordenar dados de maneira funcional, explorando as capacidades da Stream API em conjunto com os princípios da Programação Funcional. Com isso, eles serão capazes de otimizar o desempenho de suas aplicações e lidar com tarefas complexas de manipulação de dados de forma mais eficaz.");
        cursoJavaStream.setCargaHoraria(2);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição mentoria Java");
        mentoriaJava.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Claro - Java com Spring Boot");
        bootcamp.setDescricao("Construa uma API com Java e Spring de ponta a ponta!\n" +
                "\n" +
                "Vá do básico de uma das principais linguagens back-end até práticas avançadas com Spring, aplicando metodologia de testagem TDD e criando uma visão completa de system design com arquitetura de microsserviços, e faça deploy em nuvem com o AWS e copilotos de IA.\n" +
                "\n" +
                "É um conteúdo completo e totalmente alinhado com o dia a dia de desenvolvimento na Claro, com mentorias dos próprios experts da empresa.\n" +
                "\n");
        bootcamp.getConteudos().add(cursoJavaExcecoes);
        bootcamp.getConteudos().add(cursoJavaStream);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do Felipe: " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("----");
        System.out.println("Conteúdos concluídos de Felipe: "+ devFelipe.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos do Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());
        System.out.println("--------------");

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do Roberto: " + devRoberto.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Roberto: "+ devRoberto.getConteudosConcluidos());
        System.out.println("XP: " + devRoberto.calcularTotalXp());
    }
}
