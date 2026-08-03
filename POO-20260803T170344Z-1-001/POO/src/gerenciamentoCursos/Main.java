package gerenciamentoCursos;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Academico academico = new Academico("Meneses", 15, "20251cas0020037", "106.946.389-27");
        Prof prof = new Prof("Clodosvaldo", 45, "Doutor em belas artes", "012.356.987.59");
        Disciplina disciplina = new Disciplina("LP", "Ensinar metodos sort, POO e bla bla bla bla preguiça");
        Sala sala = new Sala();

        sala.setNome("primeiro");
        sala.adcionarAlunos(academico);
        sala.adcionarDisciplina(disciplina);
        sala.adcionarProf(prof);
        curso.adcionarSala(sala);
        
        // System.out.println("Tem " + curso.getSalas().size() + " sala(s) no curso");
        // System.out.println("Tem " + sala.getAcademicos().size() + " aluno(s) na sala");
        // System.out.println("Tem " + sala.getDisciplinas().size() + " disciplina(s) na sala");
        // System.out.println("Tem  " + sala.getProf().size() + " professor(S) na sala");

        for (Sala s : curso.getSalas()) {
            System.out.println("sala:");

            for (Academico a : sala.getAcademicos()) {
                System.out.println(" Aluno: " + a.getNome());
            }

            for (Prof p : sala.getProf()) {
                System.out.println(" prof: " + p.getNome());
            }

            for (Disciplina d : sala.getDisciplinas()) {
                System.out.println(" disciplina " + d.getNome());
            }
        }
    }
}
 