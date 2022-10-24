import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float verde, azul, amarelo, vermelho, total, prob1, prob2, prob3, prob4, probmaior = 0;
        System.out.println("<<Probabilidades>>");
        System.out.println("Digite a quantidade de bolinhas: ");
        System.out.println("Verde: ");
        verde = entrada.nextFloat();
        System.out.println("Azul: ");
        azul = entrada.nextFloat();
        System.out.println("Amarelo: ");
        amarelo = entrada.nextFloat();
        System.out.println("Vermelho: ");
        vermelho = entrada.nextFloat();
        total = azul + vermelho + verde + amarelo;
        prob1 = verde / total;
        prob2 = azul / total;
        prob3 = amarelo / total;
        prob4 = vermelho / total;
        if (prob1 > probmaior)
        {
            probmaior = prob1;
        }
        if (prob2 > probmaior)
        {
            probmaior = prob2;
        }
        if (prob3 > probmaior)
        {
            probmaior = prob3;
        }
        if (prob4 > probmaior)     
        {
            probmaior = prob4;
        }
        System.out.println("Probabilidades: ");
        if (probmaior == prob1)
        {
            System.out.println("Verde: " + (prob1*100) + "% <<<Maior Probabilidade");
        }
        else
        {
            System.out.println("Verde: " + (prob1*100) + "%");
        }
        if (probmaior == prob2)
        {
            System.out.println("Azul: " + (prob2*100) + "% <<<Maior Probabilidade");
        }
        else
        {
            System.out.println("Azul: " + (prob2*100) + "%");
        }
        if (probmaior == prob3)
        {
            System.out.println("Amarelo: " + (prob3*100) + "% <<<Maior Probabilidade");
        }
        else
        {
            System.out.println("Amarelo: " + (prob3*100) + "%");
        }
        if (probmaior == prob4)
        {
            System.out.println("Vermelho: " + (prob4*100) + "% <<<Maior Probabilidade");
        }
        else
        {
            System.out.println("Vermelho: " + (prob4*100) + "%");
        }
    }
}