public class Triangulo extends FormaBidimensional{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double obterArea ()
    {
        return base * altura;
    }
}
