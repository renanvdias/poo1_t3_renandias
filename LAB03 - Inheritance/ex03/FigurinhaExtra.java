public class FigurinhaExtra extends Figurinha {
    protected String categoria;
    protected String variacao;

    public FigurinhaExtra(String nome, String data, double altura, double peso, String posicao, String pais, String categoria, String variacao) {
        super(nome, data, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.variacao = variacao;
    }

    public FigurinhaExtra(Figurinha f, String categoria, String variacao) {
        super(f.getNome(), f.getData(), f.getAltura(), f.getPeso(), f.getPosicao(), f.getPais());
        this.categoria = categoria;
        this.variacao = variacao;
    }

    public void MostrarFigurinha (){
        super.MostrarFigurinha();
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Cor: " + getVariacao());
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



