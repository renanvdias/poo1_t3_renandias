public class FigurinhaExtra extends Figurinha {
    protected String categoria;
    protected String variacao;

    public FigurinhaExtra(String nome, String data, double altura, double peso, String posicao, String pais, String categoria, String variacao) {
        super(nome, data, altura, peso, posicao, pais);
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



