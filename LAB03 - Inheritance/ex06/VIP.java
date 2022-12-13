public class VIP extends Ingresso{
    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double valor()
    {
        return getValor() + adicional;
    }

}
