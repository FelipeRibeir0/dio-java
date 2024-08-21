package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo - Banco de Talentos da Claro\n");
        String [] candidatos ={
                "Rafael",
                "Mariana",
                "Lucas",
                "Camila",
                "Gabriel",
                "Aline",
                "Bruno",
                "Fernanda",
                "Eduardo",
                "Larissa"};

        for (String candidato : candidatos) {
            EntrarEmContato(candidato);
        }

    }

    static void EntrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = Atender();
            continuarTentando = !atendeu;

            if (continuarTentando){
                tentativasRealizadas++;
            }
            else {
                System.out.println("Contato foi realizado com sucesso");
            }

        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com "+ candidato+" na "+tentativasRealizadas+"ª tentativa");
        }
        else{
            System.out.println("Não conseguimos contato com "+candidato + " com o número máximo de tentativas");
        }
    }

    static boolean Atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos ={
                "Rafael",
                "Mariana",
                "Lucas",
                "Camila",
                "Gabriel",
                "Aline",
                "Bruno",
                "Fernanda",
                "Eduardo",
                "Larissa"};

        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos ={
                "Rafael",
                "Mariana",
                "Lucas",
                "Camila",
                "Gabriel",
                "Aline",
                "Bruno",
                "Fernanda",
                "Eduardo",
                "Larissa"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " solicitou o valor de salário "+salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga\n");
                candidatosSelecionados++;
            }
            else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga\n");
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double pretensaoSalarial){
        double salarioBase = 2000.0;

        if(salarioBase > pretensaoSalarial){
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == pretensaoSalarial){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}
