import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("<<<Valores iguais>>>");
        int[] valores = new int[8];
        int[] repetido = new int[8];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Entre com o número " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
        }
        System.out.print("Repetidos: ");
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                        repetido[i] = valores[j];
                }
            }
        }
        int cont = 2;
        for (int k = 0; k < repetido.length; k++) {
            if (repetido[k] != 0)
            {
                if (repetido[k] == repetido[k+1])
                {
                        cont++;
                }
            }
            if (repetido[k] != 0 && repetido[k] != repetido[k+1]) {
                System.out.println("O número: " + repetido[k] + " aparece " + cont + " vezes.");
                cont = 2;
            }
        }
    }
}