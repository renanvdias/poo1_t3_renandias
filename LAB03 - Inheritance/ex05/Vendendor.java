public class Vendendor extends Funcionario{
    private double comissao;

    public Vendendor(String nome, String dataNascimento, double salario, double comissao) {
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
