public class C3 extends C2 {
    public String nome3;
    private int id3;
    protected String desc3;

    public C3()
    {
        System.out.println("Construtor C3 sem parametros");
    }

    public C3 (String nome, int id, String descricao, String nome2, int id2, String desc2, String nome3, int id3, String desc3)
    {
        super(nome, id, descricao, nome2, id2, desc2);
        this.nome3 = nome3;
        this.id3 = id3;
        this.desc3 = desc3;
        System.out.println("Construtor C3 com parametros");
    }

    public void mostrar_atributos ()
    {
        System.out.println("Nome: " +getNome());
        System.out.println("ID: " +getId());
        System.out.println("Descrição: " +getDescricao());
        System.out.println("Nome 2: " +getNome2());
        System.out.println("ID 2: " +getId2());
        System.out.println("Descrição 2: " +getDesc2());
        System.out.println("Nome 3: " +getNome3());
        System.out.println("ID 3: " +getId3());
        System.out.println("Descrição 3: " +getDesc3());
    }

    public void mostrar_atributos_super()
    {
        super.mostrar_atributos();
        System.out.println("Nome 3: " +getNome3());
        System.out.println("ID 3: " +getId3());
        System.out.println("Descrição 3: " +getDesc3());
    }
    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }
}
