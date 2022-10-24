import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] valores = new int[5];
        int maior, menor;
        float media;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Entre com o número " + (i + 1));
            valores[i] = entrada.nextInt();
        }
        menor = valores[0];
        maior = valores[0];
        media = 0;
        System.out.print("Os números digitados são: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor)
            {
                menor = valores[i];
            }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior)
            {
                maior = valores[i];
            }
        }
        for (int i = 0; i < valores.length; i++) {
           media = valores[i] + media;
        }
        media = media / 5;
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A média dos valores é: " + media);
    }
}