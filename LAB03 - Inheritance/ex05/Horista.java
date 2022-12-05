public class Horista extends Funcionario{
    private double valor_hora;

    public Horista(String nome, String dataNascimento, double salario, double valor_hora) {
        super(nome, dataNascimento, salario);
        this.valor_hora = valor_hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
}
