import java.sql.SQLOutput;

public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public void print () {
        System.out.println("Localização do ingresso: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
