public class Main {
    public static void main(String[] args) {
        Figurinha f = new Figurinha("Carlos Mendes", "05/02/1995", 1.96, 89, "Atacante", "Brasil");
        f.MostrarFigurinha();
        FigurinhaExtra fa = new FigurinhaExtra(f, "Legends", "Bronze");
        fa.MostrarFigurinha();
    }
}