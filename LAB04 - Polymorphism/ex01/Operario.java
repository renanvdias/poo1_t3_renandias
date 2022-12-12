public class Operario extends Funcionario{
    private double valor;
    private double producao;

    public Operario(String nome, String dataNascimento, double valor, double producao) {
        super(nome, dataNascimento);
        this.valor = valor;
        this.producao = producao;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor_producao) {
        this.valor = valor_producao;
    }

    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    @Override
    public void calcular_salario ()
    {
        setSalario(valor * producao);
    }
}
