import java.lang.Math;

public class Circulo extends FormaBidimensional{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double obterArea(){
        return raio * raio * Math.PI;
    }

}
