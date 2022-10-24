import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] notas = new int[5];
        double media = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("<<<Média e desvio-padrão>>>");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Entre com a nota do aluno " + (i + 1));
            notas[i] = entrada.nextInt();
        }
        int somatorio = 0;
        for (int i = 0; i < notas.length; i++) {
            somatorio += notas[i];
        }
        media = somatorio / 5;
        float variacoes = 0;
        for (int i = 0; i < notas.length; i++) {
            double v = notas[i] - media;
            variacoes += v * v;
        }
        double sigma = Math.sqrt(variacoes / 4);
        System.out.println("A média das notas foi de: " + media + " e o desvio padrão foi de: " + sigma);
    }
}