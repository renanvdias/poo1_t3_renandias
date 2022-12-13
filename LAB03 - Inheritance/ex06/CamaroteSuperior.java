public class CamaroteSuperior extends VIP {
    public double adicional;

    public CamaroteSuperior(double valor, double adicional, double adicional1) {
        super(valor, adicional);
        this.adicional = adicional1;
    }

    public double valor_ingresso(){
        return getValor() + getAdicional() + adicional;
    }
}
