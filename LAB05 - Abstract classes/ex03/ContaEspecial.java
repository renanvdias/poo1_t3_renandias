public class ContaEspecial extends ContaCorrente{
    float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }


    public boolean debitaValor ( float val , int pwd ) {
        if ( isSenha(pwd) == false)
            return ( false ); // senha deve ser vá lida
        if ( getEstado(pwd) != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > getSaldo(pwd) + limite)
            return ( false );

        debitaValor(val);
        return ( true ) ;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
