import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figurinha[] jogadores = new Figurinha[3];
        System.out.println("==COMEÇANDO PREENCHIMENTO== ");
        for (int i = 0; i < jogadores.length; i++)
        {
            System.out.println("Insira os dados do jogador " + (i+1) + ":");
            jogadores[i] = new Figurinha(entrada.next(), entrada.next(), entrada.nextDouble(), entrada.nextDouble(), entrada.next(), entrada.next());
        }
        for (int i = 0; i < jogadores.length; i++)
        {
            System.out.println("==Jogador " + (i+1) + "==");
            System.out.println("Nome: " + jogadores[i].getNome());
            System.out.println("Data: " + jogadores[i].getData());
            System.out.println("Altura: " + jogadores[i].getAltura());
            System.out.println("Peso: " + jogadores[i].getPeso());
            System.out.println("Posição: " + jogadores[i].getPosicao());
            System.out.println("País: " + jogadores[i].getPais());
        }
    }
}