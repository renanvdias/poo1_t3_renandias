public class Servico implements Classificavel {
    private double preco;

    public boolean eMenorQue ( Classificavel o) {
        Servico compara = ( Servico ) o;
        if ( this.preco < compara.preco) {
            return true ;
        } else {
            return false ;
        }
    }

    public Servico(double preco) {
        this.preco = preco;
    }
}
