public class Chefe extends Funcionario{

    private double fixo;
    private double predefinido;

    public Chefe(String nome, String dataNascimento, double predefinido, double fixo) {
        super(nome, dataNascimento);
        this.predefinido = predefinido;
        this.fixo = fixo;
    }

    public double getPredefinido() {
        return predefinido;
    }

    public void setPredefinido(double predefinido) {
        this.predefinido = predefinido;
    }

    public double getFixo() {
        return fixo;
    }

    public void setFixo(double fixo) {
        this.fixo = fixo;
    }

    @Override
    public void calcular_salario ()
    {
        setSalario(fixo + predefinido);
    }
}
