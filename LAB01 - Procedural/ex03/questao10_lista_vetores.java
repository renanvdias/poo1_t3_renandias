import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetorA = new int[3];
        int[] vetorB = new int[3];
        int[] vetorC = new int[3];
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor " + (i+1) + " de A");
            vetorA[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Digite o valor " + (i+1) + " de B");
            vetorB[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.print("O vetor C definido como C = A-B é: (");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i]+ ", ");
        }
        System.out.print(")");
    }
}