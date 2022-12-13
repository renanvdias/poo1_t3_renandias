import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Forma [] formas = new Forma[2];
        formas[0] = new Circulo(5);
        formas[1] = new Cubo(4);
        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof FormaBidimensional)
            {
                System.out.println("Área da figura Bidimensional: " + (formas[i]).obterArea());
            }
        }

        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof FormaTridimensional)
            {
                System.out.println("Área da figura Tridimensional: " + (formas[i]).obterVolume());
            }
        }
    }
}
