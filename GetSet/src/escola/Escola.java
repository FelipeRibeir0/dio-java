package escola;

public class Escola {
    public static void main(String[] args) {
    Aluno carlos = new Aluno();
    carlos.setNome("Carlos");
    carlos.setIdade(8);

    System.out.println("O aluno " + carlos.getNome() + " tem " + carlos.getIdade() + " anos");

    }
}