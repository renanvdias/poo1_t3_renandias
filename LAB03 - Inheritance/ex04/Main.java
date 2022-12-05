public class Main {
    public static void main(String[] args) {
        C1 c = new C1("Renan", 54, "teste");
        C2 cc = new C2("Renan", 54, "teste", "Renan2", 542, "teste2");
        C3 ccc = new C3("Renan", 54, "teste", "Renan2", 542, "teste2", "Renan3", 543, "teste3");
        c.mostrar_atributos();
        cc.mostrar_atributos();
        ccc.mostrar_atributos();
    }
}