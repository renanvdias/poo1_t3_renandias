import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[5];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Entre com o número " + (i + 1));
            valores[i] = entrada.nextInt();
            if (valores[i] < 0)
            {
                valores[i] = 0;
            }
        }
        System.out.println("Zerando os negativos, obtem-se: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + "  ");
        }
    }
}