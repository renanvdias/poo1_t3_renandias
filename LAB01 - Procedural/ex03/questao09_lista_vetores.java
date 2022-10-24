import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("<<<Média de n alunos. Máximo de 100 alunos>>>");
        System.out.println("<<<Entre com o número de alunos: ");
        Scanner entrada = new Scanner(System.in);
        int num;
        num = entrada.nextInt();
        int[] notas = new int[num];
        double media = 0;
        if (num <= 100) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Entre com a nota do aluno " + (i + 1));
                notas[i] = entrada.nextInt();
            }
            double somatorio = 0;
            for (int i = 0; i < notas.length; i++) {
                somatorio += notas[i];
            }
            media = somatorio / num;
            System.out.println("Relatório de Notas");
            for (int i = 0; i < notas.length; i++) {
                System.out.println("A nota do aluno: " + (i + 1) + " é: " + notas[i]);
            }
            System.out.println("A média das notas foi de: " + media);
        } else {
            System.out.println("ERRO! O número máximo de alunos permitido é de 100");
        }
    }
}