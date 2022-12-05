public class C1 {
    public String nome;
    private int id;
    protected String descricao;

    public C1 ()
    {
        System.out.println("Construtor C1 sem parametros");
    }

    public C1(String nome, int id, String descricao)
    {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        System.out.println("Construtor C1 com parametros");
    }

    public void mostrar_atributos()
    {
        System.out.println("Nome: " +getNome());
        System.out.println("ID: " +getId());
        System.out.println("Descrição: " +getDescricao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
