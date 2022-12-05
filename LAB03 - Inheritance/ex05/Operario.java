public class Operario extends Funcionario{
    private double valor_producao;

    public Operario(String nome, String dataNascimento, double salario, double valor_producao) {
        super(nome, dataNascimento, salario);
        this.valor_producao = valor_producao;
    }

    public double getValor_producao() {
        return valor_producao;
    }

    public void setValor_producao(double valor_producao) {
        this.valor_producao = valor_producao;
    }
}
