public class C2 extends C1{
    private String nome2;
    public int id2;
    protected String desc2;

    public C2 ()
    {
        System.out.println("Construtor C2 sem parametros");
    }

    public C2(String nome, int id, String descricao, String nome2, int id2, String desc2)
    {
        super(nome, id, descricao);
        this.nome2 = nome2;
        this.id2 = id2;
        this.desc2 = desc2;
        System.out.println("Construtor C2 com parametros");
    }

    public void mostrar_atributos ()
    {
        System.out.println("Nome: " +getNome());
        System.out.println("ID: " +getId());
        System.out.println("Descrição: " +getDescricao());
        System.out.println("Nome 2: " +getNome2());
        System.out.println("ID 2: " +getId2());
        System.out.println("Descrição 2: " +getDesc2());
    }

    public void mostrar_atributos_super()
    {
        super.mostrar_atributos();
        System.out.println("Nome 2: " +getNome2());
        System.out.println("ID 2: " +getId2());
        System.out.println("Descrição 2: " +getDesc2());
    }
    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }
}
