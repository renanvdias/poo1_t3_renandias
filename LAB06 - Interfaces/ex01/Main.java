public class Main {
    public static void main(String[] args) {
        Produto [] produtos = new Produto [8];
        produtos[0] = new Produto(5);
        produtos[1] = new Produto(12);
        produtos[2] = new Produto(2);
        produtos[3] = new Produto(20);
        produtos[4] = new Produto(7);
        produtos[5] = new Produto(9);
        produtos[6] = new Produto(19);
        produtos[7] = new Produto(8);
       // ordenando em ordem decrescente
        int temp;
        for (int i = 0; i < produtos.length-1; i++) {
            for (int j = 0; j < produtos.length-i-1; j++) {
                if (produtos[j].eMenorQue(produtos[j+1])) {
                    temp = produtos[j].getCodigo();
                    produtos[j].setCodigo(produtos[j+1].getCodigo());
                    produtos[j+1].setCodigo(temp);
                }
            }
        }
        for (int k = 0; k < produtos.length; k++) {
            System.out.println(produtos[k].getCodigo());
        }
    }
}