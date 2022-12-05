import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Chefe [] chefes = new Chefe[2];
        Vendendor[] vendedores = new Vendendor[5];
        Operario[] operarios = new Operario[5];
        Horista[] horistas = new Horista[5];
        for (int i = 0; i < chefes.length; i++)
        {
            System.out.println("Escreva o nome: ");
            String nome = sc.nextLine();
            System.out.println("Escreva a data de nascimento: ");
            String data = sc.nextLine();
            System.out.println("Escreva o salário fixo: ");
            double salario = sc.nextDouble();
            sc.nextLine();
            System.out.println("Escreva o salário predefinido: ");
            double predefinido = sc.nextDouble();
            sc.nextLine();
            chefes[i] = new Chefe (nome, data, salario, predefinido);
        }
        for (int i = 0; i < chefes.length; i++){
            System.out.println("Chefe: " + chefes[i].getNome());
            System.out.println("Data Nascimento: " + chefes[i].getDataNascimento());
            System.out.println("Salário: " + chefes[i].getSalario());
            System.out.println("Salário predefinido: " + chefes[i].getPredefinido());
            System.out.println("--------------------");
        }
    }
}