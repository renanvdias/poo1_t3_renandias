import java.util.Scanner;
public class Main {
    public static int altera_preco(float preco, float porcentagem)
    {
        float temp;
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
        preco = preco * temp;  // preço modificado
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        String nome [] = new String[4];
        float preco[] = new float[4];
        int qtd_estoque[] = new int [4];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < nome.length; i++)
        {
            System.out.println("Informe o nome, o preco e a qtd. em estoque do produto " + (i+1));
            nome[i] = entrada.next();
            preco[i] = entrada.nextFloat();
            qtd_estoque[i] = entrada.nextInt();
        }
        System.out.println("Aumentando o preco em 10%% do produto 1 e 3");
        altera_preco(preco[0],-110);
        altera_preco(preco[2],10);

        System.out.println("Reduzindo o preco em 5%% do produto 2");
        if (altera_preco(preco[1],-5) ==-1)
        System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        else
            System.out.println(" Preco alterado com sucesso");

        System.out.println("Alterando o preco do prod. 3");
        if (altera_preco(preco[3],-110) == -1)
        System.out.println("Erro: preco nao alterado. Porcentagem invalida");

        System.out.println("Produtos Cadastrados:");
        for (int i = 0; i < 4; i++){
            System.out.println("Produto: " + nome[i] + "/ Preço: " + preco[i] + "/ Estoque: " + qtd_estoque[i]);
        }
    }
}