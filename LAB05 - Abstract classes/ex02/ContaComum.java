public class ContaComum extends ContaCorrente {
    float limite;

    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
        this.limite = 0;
    }
}
