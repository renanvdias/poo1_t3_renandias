public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Estudante ()
    {

    }

    public void print() {
        System.out.println("Estudante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}');
    }

    public void contarAlunos(Estudante [] estudantes)
    {
        int cont = 0, cont1 = 0, cont2 = 0;
        for (int i = 0; i < estudantes.length; i++){
            if (estudantes[i] instanceof EstudanteGraduacao){
                cont++;
            } else if (estudantes[i] instanceof EstudanteMestrado) {
                cont1++;
            } else if (estudantes[i] instanceof EstudanteDoutorado) {
                cont2++;
            }
        }
        System.out.println("Temos " + cont + " estudantes de graduação, " + cont1 + " estudantes de Mestrado e " + cont2 + " estudantes de Doutorado.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}