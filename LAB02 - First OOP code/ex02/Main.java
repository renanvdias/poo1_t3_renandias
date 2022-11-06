import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Figurinha Jogador1 = new Figurinha();
        Figurinha Jogador2 = new Figurinha();
        Figurinha Jogador3 = new Figurinha();
        Jogador1.setNome("Pedro Correia");
        Jogador1.setData("20/05/1995");
        Jogador1.setAltura(1.75);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(Jogador1.getData(), format);
        Jogador1.setPais("Brasil");
        Jogador1.setPeso(80);
        Jogador1.setPosicao("Atacante");
        Jogador2.setNome("Pedro Correia");
        Jogador2.setData("20/05/1995");
        Jogador2.setAltura(1.88);
        LocalDate.parse(Jogador2.getData(), format);
        Jogador2.setPais("Brasil");
        Jogador2.setPeso(80);
        Jogador2.setPosicao("Atacante");
        Jogador3.setNome("Pedro Correia");
        Jogador3.setData("20/05/1995");
        Jogador3.setAltura(1.90);
        LocalDate.parse(Jogador3.getData(), format);
        Jogador3.setPais("Brasil");
        Jogador3.setPeso(80);
        Jogador3.setPosicao("Atacante");
        System.out.println("==Jogador 1==");
        System.out.println("Nome: " + Jogador1.getNome());
        System.out.println("Altura: " + Jogador1.getAltura());
        System.out.println("Data " + Jogador1.getData());
        System.out.println("Pais: " + Jogador1.getPais());
        System.out.println("Peso: " + Jogador1.getPeso());
        System.out.println("Posicao: " + Jogador1.getPosicao());
        System.out.println("==Jogador 2==");
        System.out.println("Nome: " + Jogador2.getNome());
        System.out.println("Altura: " + Jogador2.getAltura());
        System.out.println("Data " + Jogador2.getData());
        System.out.println("Pais: " + Jogador2.getPais());
        System.out.println("Peso: " + Jogador2.getPeso());
        System.out.println("Posicao: " + Jogador2.getPosicao());
        System.out.println("==Jogador 3==");
        System.out.println("Nome: " + Jogador3.getNome());
        System.out.println("Altura: " + Jogador3.getAltura());
        System.out.println("Data " + Jogador3.getData());
        System.out.println("Pais: " + Jogador3.getPais());
        System.out.println("Peso: " + Jogador3.getPeso());
        System.out.println("Posicao: " + Jogador3.getPosicao());
    }
}