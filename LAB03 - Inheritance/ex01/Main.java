public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Figurinha f = new Figurinha("Bruno Mendes", "05/02/1995", 1.96, 89, "Atacante", "Brasil");
        f.MostrarFigurinha();
        FigurinhaExtra fa = new FigurinhaExtra("Bart Kindle", "06/06/1999", 1.75, 78, "Goleiro", "Canada", "Legends", "Bronze");
        fa.MostrarFigurinha();
    }
}