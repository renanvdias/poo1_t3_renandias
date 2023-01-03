import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contato [] contatos = new Contato [5];
        System.out.println("<< Bem vindo ao MENU CONTATOS! >>");
        System.out.println("Insira seus 5 contatos: ");
        for (int i = 0; i < contatos.length; i++)
        {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Apelido: ");
            String apelido = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Aniversário (dd/mm/yyyy): ");
            String aniversario = sc.nextLine();
            System.out.print("Insira seu tipo de contato: 'familia', 'amigos' ou 'trabalho' ");
            String opcao = sc.nextLine();
            if (opcao.equals("familia"))
            {
                System.out.print("Digite o parentesco: ");
                String parentesco = sc.nextLine();
                contatos[i] = new Familia(nome, apelido, email, aniversario, parentesco);
            }
            if (opcao.equals("amigos"))
            {
                System.out.print("Digite o grau (1, 2 ou 3): ");
                int grau = sc.nextInt();
                contatos[i] = new Amigos(nome, apelido, email, aniversario, grau);
                sc.nextLine();
            }
            if (opcao.equals("trabalho"))
            {
                System.out.print("Digite o tipo (chefe, colega, etc..): ");
                String tipo = sc.nextLine();
                contatos[i] = new Trabalho(nome, apelido, email, aniversario, tipo);
            }
        }

        System.out.println("IMPRIMINDO TODOS OS CONTATOS");
        for (int i = 0; i < contatos.length; i++)
        {
            System.out.println("----Contato " + (i+1) + " --------");
            contatos[i].imprimirContato();
        }

        System.out.println("IMPRIMINDO TODOS OS FAMILIARES");
        for (int i = 0; i < contatos.length; i++)
        {
            if (contatos[i] instanceof Familia) {
                System.out.println("----Familiar--------");
                contatos[i].imprimirContato();
            }
        }

        System.out.println("IMPRIMINDO TODOS OS AMIGOS");
        for (int i = 0; i < contatos.length; i++)
        {
            if (contatos[i] instanceof Amigos) {
                System.out.println("----Amigos--------");
                contatos[i].imprimirContato();
            }
        }

        System.out.println("IMPRIMINDO TODAS AS PESSOAS DE TRABALHO");
        for (int i = 0; i < contatos.length; i++)
        {
            if (contatos[i] instanceof Trabalho) {
                System.out.println("----Pessoas do Trabalho--------");
                contatos[i].imprimirContato();
            }
        }

        System.out.println("IMPRIMINDO PESQUISA ESPECÍFICA");
        for (int i = 0; i < contatos.length; i++)
        {
            if (contatos[i] instanceof Amigos)
                if (((Amigos) contatos[i]).getGrau() == 1)
            {
                System.out.println("----Melhores Amigos--------");
                contatos[i].imprimirContato();
            }

            if (contatos[i] instanceof Familia)
                if (((Familia) contatos[i]).getParentesco().equals("irmão"))
            {
                System.out.println("----Familiar/Irmão--------");
                contatos[i].imprimirContato();
            }

            if (contatos[i] instanceof Trabalho)
            if(((Trabalho) contatos[i]).getTipo().equals("colega"))
            {
                System.out.println("----Colegas de Trabalho--------");
                contatos[i].imprimirContato();
            }
        }

        System.out.println("IMPRIMINDO CONTATO DE INDICE 2");
        if (contatos[2] instanceof Trabalho)
            System.out.println("Esse contato é do trabalho! ");
        if (contatos[2] instanceof Familia)
            System.out.println("Esse contato é um familiar! ");
        if (contatos[2] instanceof Amigos)
            System.out.println("Esse contato é um amigo! ");
        contatos[2].imprimirContato();
    }
}