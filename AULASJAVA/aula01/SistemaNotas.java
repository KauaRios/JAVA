package aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        double[] notas = new double[5];

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Aluno " + (i + 1) + ":");
            String nome = leitor.nextLine();
            nomes.add(nome);

            System.out.println("Informe a nota do aluno " + (i + 1) + ":");
            notas[i] = leitor.nextDouble();

            leitor.nextLine(); // Limpeza de buffer correta!
        }

        System.out.println("\nDados Cadastrados:");
        for(int i = 0; i < 5; i++){

            System.out.println("Aluno: " + nomes.get(i) + " - Nota: " + notas[i]);
        }
        leitor.close();
    }
}