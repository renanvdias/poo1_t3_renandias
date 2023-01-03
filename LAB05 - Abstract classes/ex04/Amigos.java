public class Amigos extends Contato{
    protected int grau;
    /*
    Sendo o grau:
    1 - Melhor amigo
    2 - Amigo
    3 - Conhecido
     */

    public Amigos(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        super.imprimirBasico();
        System.out.println("Grau: " + this.grau);
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
}
