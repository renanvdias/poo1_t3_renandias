import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] valores = new int[5];
        int maior, menor, v_maior = 0, v_menor = 0;
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
                v_menor = i;
            }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior)
            {
                maior = valores[i];
                v_maior = i;
            }
        }
        for (int i = 0; i < valores.length; i++) {
           media = valores[i] + media;
        }
        media = media / 5;
        System.out.println("O maior valor é: " + maior +  ", localizado na posição " + (v_maior + 1) + " do vetor.");
        System.out.println("O menor valor é: " + menor + ", localizado na posição " + (v_menor + 1) + " do vetor.");
        System.out.println("A média dos valores é: " + media);
    }
}