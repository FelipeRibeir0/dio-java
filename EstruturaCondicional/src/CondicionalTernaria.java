/*
Ternária: Estrutura condicional que utiliza o operador ternário (?:) para avaliar uma condição.
A condição é avaliada, e um valor é retornado dependendo se a condição é verdadeira ou falsa.
Sintaxe: condição ? valor_se_verdadeiro : valor_se_falso;
*/
public class CondicionalTernaria {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}