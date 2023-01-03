public class Familia extends Contato{
    protected String parentesco; //ex: pai, irmão, etc...

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        super.imprimirBasico();
        System.out.println("Parentesco: " + this.parentesco);
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
