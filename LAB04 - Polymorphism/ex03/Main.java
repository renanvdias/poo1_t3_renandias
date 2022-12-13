public class Main {
    public static void main(String[] args) {

        Estudante [] estudantes = new Estudante[3];
        Estudante est = new Estudante();
        estudantes[0] = new EstudanteGraduacao("Renan Dias", "Rua Joaquina", "Java em Saúde");
        estudantes[1] = new EstudanteDoutorado("Bruna", "Rua 12", "Odontologia", "Java em consultas odontológicas", "Java is cool");
        estudantes[2] = new EstudanteMestrado("Ricardo", "Rua 85", "Medicina", "Java na Medicina", "Academico", "Java Medicina");
        est.contarAlunos(estudantes);
        System.out.println("----------------------");
        for (int i = 0; i < estudantes.length; i++)
        {
            estudantes[i].print();
            System.out.println("--------------------------");
        }
        System.out.println("---------COPIANDO VETOR ESTUDANTE POS GRAD----------------");
        Estudante [] estd = new EstudantePosGrad[3];
        for (int i=0; i < estudantes.length; i++){
            if (estudantes[i] instanceof EstudantePosGrad){
                estd[i] = estudantes[i];
            }
        }
        for (int i=0; i < estudantes.length; i++) {
            if (estd[i] != null) {
                estd[i].print();
            }
        }
    }
}