//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try {

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

    System.out.println("Olá, me chamo "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
    System.out.println("Tenho "+idade + " anos");
    System.out.println("Minha altura é " + altura + "cm ");

        }catch (InputMismatchException e){
            System.out.println("Os campos idades e altura devem ser numéricos");
        }
    }
}
