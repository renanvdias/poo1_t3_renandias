public class Vendendor extends Funcionario{

    private double valor_fixo;
    private double comissao;
    private double vendas;

    public Vendendor(String nome, String dataNascimento, double valor_fixo, double comissao, double vendas) {
        super(nome, dataNascimento);
        this.valor_fixo = valor_fixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getValor_fixo() {
        return valor_fixo;
    }

    public void setValor_fixo(double valor_fixo) {
        this.valor_fixo = valor_fixo;
    }

    @Override
    public void calcular_salario ()
    {
        setSalario(valor_fixo + comissao * vendas);
    }
}
