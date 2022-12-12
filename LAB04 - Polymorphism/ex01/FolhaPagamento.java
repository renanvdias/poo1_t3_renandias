public class FolhaPagamento  {

    public void mostrar (Funcionario [] func)
    {
        double total = 0;
        System.out.println(" \n FOLHA DE PAGAMENTO - LISTA DE FUNCIONÁRIOS: ");
        for (int i = 0; i < func.length; i++){
            System.out.println("Nome: " + func[i].getNome());
            System.out.println("Data de nascimento: "+ func[i].getDataNascimento());
            System.out.println("Salário " + func[i].getSalario() + "\n");
            total += func[i].getSalario();
        }
        System.out.println("-------------TOTAL DOS SALÁRIOS R$: " + total + "-----------------");
    }

}
