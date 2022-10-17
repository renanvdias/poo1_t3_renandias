import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valores[] = new int [6];
        int i = 0, resto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com os 6 números: ");
        do {
            valores[i] = entrada.nextInt();
            resto = valores[i] % 10;
            for (i = 1; i < valores.length; i++) {
                valores[i] = entrada.nextInt();
            }
            valores[i] = valores[i] / 10;
        }while (resto%2 != 0);
        System.out.println("Os valores lidos são :");
        for (int j = 5; j >= 0; j--) {
            System.out.println(valores[j]);
        }
    }
}