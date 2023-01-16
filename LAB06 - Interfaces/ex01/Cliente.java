public class Cliente implements Classificavel{
    private String nome;

    public boolean eMenorQue ( Classificavel o) {
        Cliente compara = ( Cliente ) o;
        int resultado = this.nome.compareTo(compara.nome);
        if ( resultado < 0) {
            return true ;
        } else {
            return false ;
        }
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
}
