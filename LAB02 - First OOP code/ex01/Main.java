import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Figurinha Jogador1 = new Figurinha();
        Figurinha Jogador2 = new Figurinha();
        Figurinha Jogador3 = new Figurinha();
        Jogador1.nome = "Pedro Correia";
        Jogador1.altura = 1.80;
        Jogador1.data = "20/05/1995";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(Jogador1.data, format);
        Jogador1.pais = "Brasil";
        Jogador1.peso = 80;
        Jogador1.posicao = "Atacante";
        Jogador2.nome = "Kloken Karkaus";
        Jogador2.altura = 1.78;
        Jogador2.data = "15/03/1995";
        LocalDate.parse(Jogador2.data, format);
        Jogador2.pais = "Bélgica";
        Jogador2.peso = 85;
        Jogador2.posicao = "Goleiro";
        Jogador3.nome = "Bob Freakles";
        Jogador3.altura = 1.82;
        Jogador3.data = "10/11/1997";
        LocalDate.parse(Jogador3.data, format);
        Jogador3.pais = "Estados Unidos";
        Jogador3.peso = 79;
        Jogador3.posicao = "Zagueiro";
        System.out.println("==Jogador 1==");
        System.out.println("Nome: " + Jogador1.nome);
        System.out.println("Altura: " + Jogador1.altura);
        System.out.println("Data " + Jogador1.data);
        System.out.println("Pais: " + Jogador1.pais);
        System.out.println("Peso: " + Jogador1.peso);
        System.out.println("Posicao: " + Jogador1.posicao);
        System.out.println("==Jogador 2==");
        System.out.println("Nome: " + Jogador2.nome);
        System.out.println("Altura: " + Jogador2.altura);
        System.out.println("Data " + Jogador2.data);
        System.out.println("Pais: " + Jogador2.pais);
        System.out.println("Peso: " + Jogador2.peso);
        System.out.println("Posicao: " + Jogador2.posicao);
        System.out.println("==Jogador 3==");
        System.out.println("Nome: " + Jogador3.nome);
        System.out.println("Altura: " + Jogador3.altura);
        System.out.println("Data " + Jogador3.data);
        System.out.println("Pais: " + Jogador3.pais);
        System.out.println("Peso: " + Jogador3.peso);
        System.out.println("Posicao: " + Jogador3.posicao);
    }
}