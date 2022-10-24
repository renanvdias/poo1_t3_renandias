import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("<<<Universidade X>>>");
        System.out.println("Digite a quantidade de alunos que serão cadastrados: ");
        num = entrada.nextInt();
        int[] num_aluno = new int[num];
        int[] cra = new int[num];
        String[] social = new String[num];
        for (int i = 0; i < num_aluno.length; i++) {
            System.out.print("Entre com o número do aluno: ");
            num_aluno[i] = entrada.nextInt();
            System.out.print("Entre com a classe do aluno " + num_aluno[i] + ": ");
            social[i] =  entrada.next();
            System.out.print("Entre com o CRA do aluno " + num_aluno[i] + ": ");
            cra[i] = entrada.nextInt();
        }
        System.out.println("===Alunos cadastrados ====");
        for (int i = 0; i < num_aluno.length; i++) {
            System.out.println("Número: " + num_aluno[i] + " // Classe social: " + social[i] + " // CRA: " + cra[i]);
        }
    }
}