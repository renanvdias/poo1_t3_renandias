public class Chefe extends Funcionario{
    private double predefinido;

    public Chefe(String nome, String dataNascimento, double salario, double predefinido) {
        super(nome, dataNascimento, salario);
        this.predefinido = predefinido;
    }

    public double getPredefinido() {
        return predefinido;
    }

    public void setPredefinido(double predefinido) {
        this.predefinido = predefinido;
    }
}
