import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valores[] = new int [6];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i<valores.length; i++) {
            System.out.println("Entre com o número " + (i+1));
            valores[i] = entrada.nextInt();
        }
            System.out.println("Os valores lidos são: " + valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + valores[5]);
    }
}