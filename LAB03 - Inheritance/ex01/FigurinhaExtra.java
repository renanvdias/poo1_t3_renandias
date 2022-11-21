public class FigurinhaExtra {
    private String nome;
    private String data;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;
    private String categoria;
    private String variacao;

    public FigurinhaExtra(String nome, String data, double altura, double peso, String posicao, String pais, String categoria, String variacao) {
        this.nome = nome;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
        this.categoria = categoria;
        this.variacao = variacao;
    }

    public void MostrarFigurinha (){
        System.out.println("---FIGURINHA---");
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getData());
        System.out.println("Altura: " +  getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPosicao());
        System.out.println("País: " + getPais());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Cor: " + getVariacao());
        System.out.println("------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVariacao() {
        return variacao;
    }

    public void setVariacao(String variacao) {
        this.variacao = variacao;
    }
}



