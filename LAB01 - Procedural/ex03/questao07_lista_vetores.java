import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] notas = new int[5];
        int maior = 0, menor = 0, v_maior = 0;
        int media = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("<<<Normalizando Notas>>>");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Entre com a nota do aluno " + (i + 1));
            notas[i] = entrada.nextInt();
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior)
            {
                v_maior = i;
            }
        }
        notas[v_maior] = 100;
        for (int i = 0; i < notas.length; i++) {
            media = notas[i] + media;
        }
        media = media / 5;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media)
            {
                int sub;
                sub = media - notas[i];
                notas[i] = notas[i] + sub;
            }
        }
        System.out.println("Notas normalizadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}