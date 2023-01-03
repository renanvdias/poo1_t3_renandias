public class Main {
    public static void main(String[] args) {
        ContaCorrente [] contas = new ContaCorrente[3];
        contas[0] = new ContaEspecial(150, 01, 1515, 200);
        contas[1] = new ContaComum(100, 02, 1414);
        contas[2] = new ContaEspecial(200, 03, 1717, 100);

        for (int i = 0; i < contas.length; i++)
        {
            if (contas[i] instanceof ContaEspecial)
                if (((ContaEspecial) contas[i]).getLimite() == 0)
                {
                    contas[i] = new ContaComum (contas[i].getSaldo(((ContaEspecial) contas[i]).getSenha()), contas[i].getNumConta(), contas[i].getSenha());
                }
        }
        System.out.println("Saldo antes do depósito: "+contas[1].getSaldo(1414));
        contas[1].creditaValor(1414, 100);
        System.out.println("Saldo depois do depósito: "+contas[1].getSaldo(1414));
        System.out.println(contas[2].getSaldo(1717));
        contas[2].debitaValor(100, 1717);
        System.out.println(contas[2].getSaldo(1717));
        contas[2].creditaValor(1717, 500);
        System.out.println(contas[2].getSaldo(1717));
    }
}