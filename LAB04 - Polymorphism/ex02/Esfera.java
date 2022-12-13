import java.lang.Math;

public class Esfera extends FormaTridimensional{

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double obterArea () {
        return 4 * Math.PI * (raio * raio);
    }

    public double obterVolume()
    {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }
}
