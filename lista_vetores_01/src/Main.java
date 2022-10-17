import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valores[] = new int [6];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com os 6 números: ");
        for (int i = 0; i < valores.length; i++)
        {
            valores[i] = entrada.nextInt();
        }
        System.out.println("Os valores lidos são :");
        for (int i = 5; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}