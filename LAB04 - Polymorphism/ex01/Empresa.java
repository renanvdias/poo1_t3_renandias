import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario [] func = new Funcionario[4];
        for (int i = 0; i < func.length; i++)
        {
            System.out.println("Escreva o nome: ");
            String nome = sc.nextLine();
            System.out.println("Escreva a data de nascimento: ");
            String data = sc.nextLine();
            System.out.println("Escreva o tipo de funcionario: H - Horista / C - Chefe / O - Operário / V - Vendedor");
            String opcao = sc.nextLine();
            if (opcao.equals("H"))
            {
                System.out.println("Escreva o valor da hora: ");
                double valor = sc.nextDouble();
                sc.nextLine();
                System.out.println("Escreva as horas trabalhadas: ");
                double horas = sc.nextDouble();
                func[i] = new Horista(nome, data, valor, horas);
                func[i].calcular_salario();
                System.out.println("Salário total: R$"+ func[i].getSalario());
                sc.nextLine();
            }
            if (opcao.equals("C"))
            {
                System.out.println("Escreva o salário fixo: ");
                double salary = sc.nextDouble();
                System.out.println("Escreva o salário predefinido: ");
                double predef = sc.nextDouble();
                func[i] = new Chefe(nome, data, predef, salary);
                func[i].calcular_salario();
                System.out.println("Salário total: R$"+ func[i].getSalario());
                sc.nextLine();
            }
            if (opcao.equals("O"))
            {
                System.out.println("Escreva o valor por produção: ");
                double prod = sc.nextDouble();
                System.out.println("Escreva a quantidade produzida: ");
                double qtd = sc.nextDouble();
                func[i] = new Operario(nome, data, prod, qtd);
                func[i].calcular_salario();
                System.out.println("Salário total: R$"+ func[i].getSalario());
                sc.nextLine();
            }
            if (opcao.equals("V"))
            {
                System.out.println("Escreva o valor fixo: ");
                double vfixo = sc.nextDouble();
                System.out.println("Escreva o valor da comissão/venda: ");
                double vcomissao = sc.nextDouble();
                System.out.println("Escreva a quantidade de vendas: ");
                double qtd = sc.nextDouble();
                func[i] = new Vendendor(nome, data, vfixo, vcomissao, qtd);
                func[i].calcular_salario();
                System.out.println("Salário total: R$"+ func[i].getSalario());
                sc.nextLine();
            }
        }
        FolhaPagamento folha = new FolhaPagamento();
        folha.mostrar(func);
    }
}