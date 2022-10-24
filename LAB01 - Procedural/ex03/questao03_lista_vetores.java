import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valores[] = new int[6];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Entre com o número " + (i + 1));
            valores[i] = entrada.nextInt();
        }
        System.out.println("A ordem inversa é: ");
        for (int j = 5; j >= 0; j--) {
            System.out.print(valores[j]);
        }
    }
}