public class Tetraedro extends FormaBidimensional{

    private double lado;
    private double altura;
    private double area;

    public Tetraedro(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double obterArea ()
    {
        this.area = (lado * lado) * Math.sqrt(3);
        return area;
    }

    public double obterVolume()
    {
        return (1/3) * area * altura;
    }
}
