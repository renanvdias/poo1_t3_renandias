import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valores[] = new int [6];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número 1");
        valores[0] = entrada.nextInt();
        System.out.println("Entre com o número 2");
        valores[1] = entrada.nextInt();
        System.out.println("Entre com o número 3");
        valores[2] = entrada.nextInt();
        System.out.println("Entre com o número 4");
        valores[3] = entrada.nextInt();
        System.out.println("Entre com o número 5");
        valores[4] = entrada.nextInt();
        System.out.println("Entre com o número 6");
        valores[5] = entrada.nextInt();
        System.out.println("Os valores lidos são: " + valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + valores[5]);
    }
}