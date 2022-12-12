public class Horista extends Funcionario{
    private double valor_hora;
    private double horas;

    public Horista(String nome, String dataNascimento, double valor_hora, double horas) {
        super(nome, dataNascimento);
        this.valor_hora = valor_hora;
        this.horas = horas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public void calcular_salario ()
    {
        setSalario(valor_hora * horas);
    }
}
