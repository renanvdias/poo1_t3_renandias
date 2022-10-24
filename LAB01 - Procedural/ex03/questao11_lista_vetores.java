import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        System.out.println("<<<Pares e Impares>>>");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            vetorA[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++)
        {
            if (vetorA[i] % 2 != 0)
            {
                vetorB[i] = vetorA[i];
            } else
            {
                vetorC[i] = vetorA[i];
            }
        }
        System.out.print("Impares: ");
        for (int i = 0; i < vetorC.length; i++) {
            if (vetorB[i] != 0) {
                System.out.print(vetorB[i] + ", ");
            }
        }
        System.out.print("\n");
        System.out.print("Pares: ");
        for (int i = 0; i < vetorC.length; i++){
            if (vetorC[i] != 0) {
                System.out.print(vetorC[i] + ", ");
            }
        }
    }
}