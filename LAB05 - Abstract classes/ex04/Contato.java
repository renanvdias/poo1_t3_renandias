public abstract class Contato {
    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;
    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public void imprimirBasico()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Apelido: " + this.apelido);
        System.out.println("Email: " + this.email);
        System.out.println("Aniversário: " + this.aniversario);
    }

    public abstract void imprimirContato();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}
