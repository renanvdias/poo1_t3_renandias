public class Trabalho extends Contato{
    protected String tipo; // ex: chefe, colega, etc.

    public Trabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        super.imprimirBasico();
        System.out.println("Tipo: " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
